#include<bits/stdc++.h>
using namespace std;
class TreeNode {
public:
	int data;
	TreeNode *left, *right;
	TreeNode(int d) {
		data = d;
		left = nullptr;
		right = nullptr;
	}
};

void banakede(TreeNode* &nodee) {
	string left, right;
	int d;
	cin >> d;
	nodee = new TreeNode(d);
	cin >> left;
	if (left == "true") banakede(nodee->left);
	cin >> right;
	if (right == "true") banakede(nodee->right);
}

TreeNode* leavehata(TreeNode*nodee) {
	if (nodee == nullptr) return nodee;

	if (!nodee->left && !nodee->right) {
		delete nodee;
		return nullptr;
	}

	nodee->left = leavehata(nodee->left);
	nodee->right = leavehata(nodee->right);
	return nodee;
}


void nikaalab(TreeNode*nodee) {
	if (nodee == nullptr) return;
	if (nodee->left) cout << nodee->left->data << " => ";
	else cout << "END => ";
	cout << nodee->data;
	if (nodee->right) cout << " <= " << nodee->right->data;
	else cout << " <= END";
	cout << endl;
	nikaalab(nodee->left);
	nikaalab(nodee->right);
}

int main() {
	TreeNode* nodee = nullptr;
	banakede(nodee);
	leavehata(nodee);
	nikaalab(nodee);
	return 0;
}
