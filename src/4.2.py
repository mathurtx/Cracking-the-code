from enum import Enum

class State(Enum):
	Unvisited = 1
	Visited = 2
	Visiting = 3

def search(graph, start, end):
	queue = []
	for node in graph.getNodes():
		node.state = State.Unvisited

	start.state = State.Visiting
	queue.append(start)
	while len(queue) > 0:
		u = queue[1]
		del queue[1]
		if u!=None:
			for node_v in u.getAdjacent():
				if node_v.state == State.Unvisited:
					if node_v == end:
						return True
					else:
						node_v.state = State.Visiting
						queue.append(node_v)
			u.state = State.Visited
	return False