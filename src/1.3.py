def removeDuplicates(string):
    string = string.lower()
    string_list = list(string)
    string_set = set(string_list)
    print(string_set)
    return ''.join(list(string_set))


print(removeDuplicates('Sentences'))