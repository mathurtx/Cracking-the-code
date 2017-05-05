def ifRotation(s1, s2):
	if s1 == None:
		return False
	if len(s1) == 1:
		if s1 == s2:
			return True
		return False
	s11 = s1+s1
	if s2 in s11:
		return True
	return False

print(ifRotation('waterbottle','erbottlewat'))
