def anagrams(string1, string2):
    string1_dict = {}
    string1_list = list(string1)
    string2_list = list(string2)
    for x in string1_list:
        if x not in string1_dict.keys():
            string1_dict[x] = 0
        string1_dict[x] = string1_dict[x]+1
    for x in string2_list:
        if x in string1_dict.keys():
            string1_dict[x] = string1_dict[x]-1
            if string1_dict[x] == 0:
                del string1_dict[x]
        else:
            return False
    if len(string1_dict.keys()) == 0:
        return True
    return False



print(anagrams('heye','eheyw'))