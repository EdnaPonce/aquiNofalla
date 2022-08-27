#include <iostream>
#include <string>

using std::cout; using std::cin;
using std::endl; using std::string;

struct ListNode {
    struct ListNode *next{};
    string data;
};

struct ListNode *insertNode(struct ListNode *root, string data) {
    auto new_node = new ListNode;
    if (root) {
        while (root->next)
            root = root->next;

        new_node->next = nullptr;
        new_node->data = std::move(data);
        root->next = new_node;

        return root->next;
    }
    new_node->next = nullptr;
    new_node->data = std::move(data);
    return new_node;
}

int deleteNode(struct ListNode *root, struct ListNode *node) {
    if (node == nullptr || root == nullptr)
        return EXIT_FAILURE;

    if (root == node) {
        if (root->next == nullptr) {
            delete node;
            root = nullptr;
            return EXIT_SUCCESS;
        }

        node = root->next;
        root->data = root->next->data;
        root->next = root->next->next;
        delete node;
        return EXIT_SUCCESS;
    }

    auto prev = root;
    while (prev->next != node && prev->next != nullptr) {
        prev = prev->next;
    }

    prev->next = node->next;
    delete node;
    return EXIT_SUCCESS;
}

void freeNodes(struct ListNode *root) {
    struct ListNode *tmp = nullptr;
    while (root) {
        tmp = root;
        root = root->next;
        delete tmp;
    }
}

void printNodes(struct ListNode *node) {
    auto count = 0;
    while (node){
        cout << "Tarea " << count << " - es: " << node->data << endl;
        node = node->next;
        count++;
    }
}

int main() {
    struct ListNode *head = nullptr;
    head = insertNode(head, "eat");

    //nodo que se va a eliminar por cumplir tarea 

    auto iter = insertNode(head, "to mop the floor");
    insertNode(head, "Make a homework");
    printNodes(head);
    cout << " ----------------------------------- " << endl;

    deleteNode(head, iter);
    printNodes(head);

    freeNodes(head);
    return EXIT_SUCCESS;
}