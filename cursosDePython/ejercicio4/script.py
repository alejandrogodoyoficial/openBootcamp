nums1 = range(1,101)

print("Using for")
for i in nums1[::-1]:
	print(i)

print("Using while")

i=100
while(i !=0):
	print(i)
	i -= 1

print("Using recurtion")
def myFunction(num):
	if num > 0:
		print(num)
		return myFunction(num-1)
myFunction(100)
