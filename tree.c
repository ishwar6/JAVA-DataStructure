struct node 
{ 
	int data; 
	struct node *left; 
	struct node *right; 
}; 


struct node* newNode(int data) 
{ 
// Allocate memory for new node 
struct node* node = (struct node*)malloc(sizeof(struct node)); 

// Assign data to this node 
node->data = data; 

// Initialize left and right children as NULL 
node->left = NULL; 
node->right = NULL; 
return(node); 
} 

