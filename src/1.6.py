import numpy as np

def setZero(array):
	row = np.zeros(array.shape[0])
	col = np.zeros(array.shape[1])
	row_len = array.shape[0]
	col_len = array.shape[1]
	for i in range(row_len):
		for j in range(col_len):
			if array[i][j] == 0:
				row[i] = 1
				col[j] = 1
	for i in range(row_len):
		for j in range(col_len):
			if row[i] == 1 or col[j] == 1:
				array[i][j] = 0
	return array

array = np.random.randint(low=1, high=5, size=(4,4))
array[1][1]=0
print(array)
print(setZero(array))