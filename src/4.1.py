class Node:
	def __init__(self):
		left = None
		right = None

def maxDepth(root):
	if root == None:
		return 0
	return 1 + max(maxDepth(root.left), maxDepth(root.right))

def minDepth(root):
	if root == None:
		return 0
	return 1 + min(minDepth(root.left), minDepth(root.right))

def isBalanced(root):
	maxDepth = maxDepth(root)
	minDepth = minDepth(root)
	if maxDepth - minDepth>1:
		return False
	return True