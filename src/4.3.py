class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value

def addNodeToTree(array, start, end):
    if end < start:
        return None
    mid = int((start + end)/2)
    node = Node(array[mid])
    node.left = addNodeToTree(array, start, mid-1)
    node.right = addNodeToTree(array,mid+1, end)
    return node

def createBinaryTreeWithMinimalHeight(array):
    return addNodeToTree(array, 0, len(array)-1)

def printInOrder(root):
    if root == None:
        return
    printInOrder(root.left)
    print(root.value)
    printInOrder(root.right)

def printPreOrder(root):
    if root == None:
        return
    print(root.value)
    printPreOrder(root.left)
    printPreOrder(root.right)

def printPostOrder(root):
    if root == None:
        return
    printPostOrder(root.left)
    printPostOrder(root.right)
    print(root.value)

node = createBinaryTreeWithMinimalHeight([1,2,3,4,5,6,7,8])
print("Printing Inorder")
printInOrder(node)
print("Printing preorder")
printPreOrder(node)
print("Printing postorder")
printPostOrder(node)


