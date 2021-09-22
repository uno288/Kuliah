list = [5,1,2,4,3,7,6]

#proses buble sort
lastElementIndex = len(list)-1
print (0,list)
for i in range(lastElementIndex):
    if list[i] > list[i+1]:
        list[i],list[i+1] = list[i+1],list[i]

    print(i+1, list)

