def BubbleSort(list): 
    AngkaAkhir = len(list)-1                    # exchange the elements to arrange in order
    for passNo in range (AngkaAkhir, 0, -1):
        for i in range(passNo):
            if list[i] > list[i+1]:
                list[i],list[i+1] = list[i+1],list[i] 
    return list

#list = [5,1,2,4,3,7,6]
list = [100,20,60,90,40,30,10]
print (BubbleSort(list))

