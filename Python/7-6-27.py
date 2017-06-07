paragraph = raw_input("Enter Something: ")
spaceSplit = paragraph.split(" ")
print("Split by space" + str(spaceSplit))

hashMap = {}
x = 0
for word in spaceSplit:
	hashMap[x] = word
	x += 1
print("Hash map of words " + str(hashMap))

reverseHashMap = {}
x = 0
for word in spaceSplit:
	if word not in reverseHashMap:
		reverseHashMap[word] = x
		x += 1
compressed = []
for word in spaceSplit:
	compressed.append(reverseHashMap[word])
print("Compressed number list" + str(compressed))
