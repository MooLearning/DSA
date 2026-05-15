class Node {
public:
    int data;
    Node *next;

    Node(int new_data) {
        this->data = new_data;
        this->next = nullptr;
    }
};
