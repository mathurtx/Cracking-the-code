def rotate90(array):
	for layer in range(0, array.shape[0]):
		first = layer
		last = len(array) - 1 - layer
		for i in range(first, last):
			offset = i - first
			top = array[first][i]
			array[first][i] = array[last-offset][first]
			array[last-offset][first] = array[last][last-offset]
			array[last][last-offset] = array[i][last]
			array[i][last] = top
	return array

import numpy as np
array = np.random.rand(4,4)
print(rotate90(array))