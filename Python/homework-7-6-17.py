import math

running = 1
numbers = []

def loadNumbers(filename):
	pass

def saveNumbers(filename):
	pass

def calculateAverage(type):
	result = "undefined"
	if type == "mean":
		total = 0
		amount = 0
		for num in numbers:
			total += num
			amount += 1
		result = total / amount
	elif type == "median":
		length = len(numbers)
		result = numbers[int(math.floor(length / 2))]
	elif type == "mode":
		numFreq = {}
		for num in numbers:
			if num not in numFreq:
				numFreq[num] = 1
			else:
				numFreq[num] += 1
		largest = 0
		largestVal = 0
		for num in numFreq:
			if numFreq[num] > largest:
				largest = numFreq[num]
				largestVal = num
		return(largestVal)

	return(result)

while running:
	number = raw_input("Enter a number, or 'output' or 'quit': ")
	if number == "output":
		averageType = raw_input("Choose a type of average 'mean', 'median' or 'mode': ")
		print("The " + averageType + " average is " + str(calculateAverage(averageType)))
		running = 0
	elif number == "quit":
		running = 0
	else:
		numbers.append(int(number))
