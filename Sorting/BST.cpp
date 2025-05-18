#include<bits/stdc++.h>
using namespace std;

struct node{
    int data;
    node *left;
    node *right;
};

int choice;
node* root = NULL;

void show(struct node *tmp);
void show1(struct node *tmp);
void Insert(struct node *tmp,int val);
void Search(struct node *tmp,int val);

void Min(struct node *tmp)
{
    if(tmp->left == NULL){
        cout << "min is = " << tmp->data << endl;
        return;
    }
    Min(tmp->left);
}
void Max(struct node *tmp)
{
    if(tmp->right == NULL){
        cout << "min is = " << tmp->data << endl;
        return;
    }
    Max(tmp->right);
}
void f(struct node *tmp){
    if(tmp == NULL)return;
    f(tmp->left);
    cout << tmp->data << " ";
    f(tmp->right);

}
int main()
{
    node *tmp = new node();
    cout << "Enter root value " << endl;
    int val;
    cin >> val;
    tmp->data = val;
    tmp->left = NULL;
    tmp->right = NULL;
    root = tmp;
    while(1){
        cout << "Enter choice " << endl;
        cout << "1.Insert\n2.show\n3.search \n4.min/max val\n5.exit\n\n" ;
        cin >> choice;
        if(choice == 1){
            cout <<"Input value that you Insert \n" << endl;
            int x;
            cin >> x;
            Insert(root,x);
        }
        else if(choice == 2){
            cout << "Inorder print = ";
            show(root);
            cout << endl;
            cout << "node is = n left child is x right child is y " << endl;
            show1(root);
        }
        else if(choice == 3){
            cout << "Enter search value " << endl;
            int x;
            cin >> x;
            Search(root,x);
        }
        else if(choice == 4){
            cout << "1.min\n2.max\n";
            int x;
            cin >> x;
            if(x == 1){
                Min(root);
            }
            else Max(root);
        }
        else break;
    }
    f(root);
}
void Insert(struct node *tmp,int val)
{
    if(tmp->data < val){
        if(tmp->right == NULL){
            node *new_n = new node();
            new_n ->data = val;
            new_n ->left = NULL;
            new_n ->right = NULL;
            tmp->right = new_n;
            return;
        }
        else Insert(tmp->right,val);
    }
    else{
        if(tmp-> left == NULL){
            node *new_n = new node();
            new_n ->data = val;
            new_n ->left = NULL;
            new_n ->right = NULL;
            tmp->left = new_n;
            return;
        }
        else Insert(tmp->left,val);
    }
}
void Search(struct node *tmp,int val)
{
    //cout << tmp->data << endl;
    if(tmp->data == val){
        cout << "Item Found " << endl;
        return;
    }
    if(tmp->data < val){
        if(tmp->right == NULL){
            cout << "Item Not Found" << endl;
            return;
        }
        else Search(tmp->right,val);
    }
    else {
        if(tmp->left == NULL){
            cout << "Item Not Found" << endl;
            return;
        }
        else Search(tmp->left,val);
    }
}
void show1(struct node *tmp)
{
    if(tmp != NULL){
        cout << "node is " << tmp-> data <<" ";
        if(tmp->left != NULL){
            cout << "left child is " << tmp->left->data <<" ";
        }
        if(tmp->right != NULL){
            cout << "right child is " << tmp->right->data <<" ";
        }
        cout << endl;
        show1(tmp->left);///left
        //cout << tmp->data <<" ";///root
        show1(tmp->right);///right
    }
    return;
}
void show(struct node *tmp)
{
    if(tmp != NULL){
        show(tmp->left);///left
        cout << tmp->data <<" ";///root
        show(tmp->right);///right
    }
    return;
}
