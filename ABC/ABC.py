
def ABC(num, letters):
    minIndex, midIndex, maxIndex = getMinMax(num)
    answerList = []
    for y in range(3):
        if(letters[y] == "A"):
            answerList.insert(y,num[minIndex])  
        elif(letters[y] == "C"):
            answerList.insert(y,num[maxIndex])
        elif(letters[y] == "B"):
            answerList.insert(y,num[midIndex])
    print(answerList)

def turnIntoNum(num):
    newList = []
    for x in range(3):
        newList.append(int(num[x]))
    return newList


def getMinMax(num):    
    maxIndex = 0
    minIndex = 0
    midIndex = 0
    for x in range(3):
        if(num[x] > num[maxIndex]):
            maxIndex = x 
        if(num[x] < num[minIndex]):
            minIndex = x
    for x in range(3):
        if(num[x] > num[minIndex] and num[x] < num[maxIndex]):
            midIndex = x
    return(minIndex, midIndex, maxIndex)    

inputNum = input()
inputLetters = input()
num = inputNum.split(" ")
letters = list(inputLetters)
ABC(turnIntoNum(num), letters)