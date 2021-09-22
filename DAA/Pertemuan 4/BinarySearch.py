def BubbleSort(list): 
    Akhir = len(list)-1                    # exchange the elements to arrange in order
    for passNo in range (Akhir, 0, -1):
        for i in range(passNo):
            if list[i] > list[i+1]:
                list[i],list[i+1] = list[i+1],list[i] 
    return list

def binary(list, item):

    pertama = 0
    akhir = len (list) - 1
    found = False

    while pertama <= akhir and not found: 
        mid = (pertama + akhir)//2

        if list [mid] == item: 
            found = True
        else:
            if item < list[mid]:
                akhir = mid - 1
            else: 
                pertama = mid + 1
                
    return found

#list = [12,33,11,99,22,55,90]
list =  ['y','u','i','w','o','a','q','u','j','p']

sorted_list = (BubbleSort(list))
print(binary(list, 'a'))
