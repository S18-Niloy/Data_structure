################################################### Left Shift deletion ###################################################

c = [25, 22, 52, 25, 0, 0, 45, 25, 5, 19, 12, 5, 26]
start = 6
size = 11
cap = 13
l = (start+size-1)%cap
i = start
index = 0
u = start+size
print(l)
while i< size+start:
    if c [i%len(c)] == 25:
        index = i%len(c)
        
    i+=1

i = 0

while i<= 0:
    c[index]=c[index+1]
    index+=1
    if index >= len(c)-1:
      index=0
      
    i+=1

    


print(c)


################################################### Insertion ###################################################

c = [3,4,0,0,1,6]
cir = [0]*len(c)
start = 4
pos = 3
new_element = 5

for i in range(start,start+pos+1):
  cir[i%len(c)]=c[i%len(c)]


idx = (start+pos)%len(cir)

for i in range(idx+1,start-1):
  cir[i]=cir[i-1]

cir[idx] = new_element

print(cir)

################################################### Right Shift deletion ###################################################

c = [25, 22, 52, 25, 0, 0, 45, 25, 5, 19, 12, 5, 26]
start = 6
size = 11
cap = 13
l = (start+size-1)%cap
i = start
index = 0
u = start+size
print(l)
while i< size+start:
    if c [i%len(c)] == 25:
        index = i%len(c)
        
    i+=1

i = 0
print("index of the deleted element:",index)
while i<= 11:
    c[index]=c[index-1]
    index-=1
    if index >= len(c)-1:
      index=0
      
    i+=1


    


print(c)
