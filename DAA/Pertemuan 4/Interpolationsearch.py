def BubbleSort(list): 
    Akhir = len(list)-1                    # exchange the elements to arrange in order
    for passNo in range (Akhir, 0, -1):
        for i in range(passNo):
            if list[i] > list[i+1]:
                list[i],list[i+1] = list[i+1],list[i] 
    return list

def IntPolsearch(list, item):

    a = 0
    b = (len (list)-1)
    found = False

    while a <= b and item >= list[a] and item <= list[b]:
        mid = a + int ((float(b - a) / (list[b] - list[a])) * (item - list[a])) 

        if list[mid] == item:
          found = True
          return found

        if list[mid] < item:
            a = mid + 1

    return found 
       
list = [20,2,0,7,1,4,3]
#list =  ['y','u','i','w','o','a','q','u','j','p']

sorted_list = BubbleSort(list)
print(BubbleSort(list))
print (IntPolsearch(list, 2))
print (IntPolsearch(list, 5))