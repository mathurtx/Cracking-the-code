def hasUnique(string):
	string_list = list(string)
	if len(set(string_list)) != len(string_list):
		return False
	return True

print(hasUnique("Sentence"))