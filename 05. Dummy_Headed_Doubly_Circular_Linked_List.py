class Node:
  def __init__(self, e):
    self.element = e
    self.next = None
    self.prev = None
    
class DoublyList:
  
  def __init__(self, a):
  #  Design the constructor based on data type of a. If 'a' is built in python list then
  #  Creates a linked list using the values from the given array.
    
    self.head = Node(0)
    h = self.head
    i= 0
    while i < len(a):
      tail = Node(a[i])
      h.next = tail
      tail.prev = h
      h=tail
      i+=1
    h.next = self.head
    self.head.prev = h
    
  
  # Counts the number of Nodes in the list
  def countNode(self):
    n = self.head
    i = 0
    while n.next != self.head:
      n = n.next
      i+=1
    return i
  
  # prints the elements in the list
  def forwardprint(self):
    n = self.head.next
    while n!=self.head:
      print(n.element,end=' ')
      n = n.next
    print('\n')
      

  # prints the elements in the list backward
  def backwardprint(self):
    n = self.head.prev
    while n.prev!=self.head.prev:
      print(n.element,end = ' ')
      n = n.prev
    print('\n')

  # returns the reference of the at the given index. For invalid index return None.
  def nodeAt(self, idx):
    self.idx = idx
    n = self.head.next
    i = 0
    while i<idx:
      n = n.next
      i+=1
    return n
  
  # returns the index of the containing the given element. if the element does not exist in the List, return -1.
  def indexOf(self, elem):
    self.elem = elem

    n = self.head.next
    i = 0
    while n!=self.head:
      if n.element != self.elem:
        i+=1
      n = n.next
    return i
      

  # inserts containing the given element at the given index Check validity of index. 
  def insert(self, elem, idx):
    self.n = Node(elem)
    i = 0
    current = self.head

    while i<idx:
      current = current.next
      i+=1
    n_1 = current.next
    current.next = self.n
    self.n.prev = current
    self.n.next = n_1
    n_1.prev = self.n

  # removes at the given index. returns element of the removed node. Check validity of index. return None if index is invalid.
  def remove(self, idx):
    i = 0
    current = self.head
    n = 0
    
    while i<idx:
      current = current.next
      i+=1
    n = current.next.element
    n_0 = current.next.next
    current.next = n_0
    n_0.prev = current
    return str(n)




print("///  Test 01  ///")
a1 = [10, 20, 30, 40]
h1 = DoublyList(a1) # Creates a linked list using the values from the array

h1.forwardprint() # This should print: 10,20,30,40. 
h1.backwardprint() # This should print: 40,30,20,10. 
print(h1.countNode()) # This should print: 4

print("///  Test 02  ///")
# returns the reference of the at the given index. For invalid idx return None.
myNode = h1.nodeAt(2)
print(myNode.element) # This should print: 30. In case of invalid index This will print "index error"

print("///  Test 03  ///")
# returns the index of the containing the given element. if the element does not exist in the List, return -1.
index = h1.indexOf(40)
print(index) # This should print: 3. In case of element that 
#doesn't exists in the list this will print -1.

print("///  Test 04  ///")

a2 = [10, 20, 30, 40]
h2 = DoublyList(a2) # uses the  constructor
h2.forwardprint() # This should print: 10,20,30,40.  

# inserts containing the given element at the given index. Check validity of index.
h2.insert(85,0)
h2.forwardprint() # This should print: 85,10,20,30,40. 
h2.backwardprint() # This should print: 40,30,20,10,85.

print()
h2.insert(95,3)
h2.forwardprint() # This should print: 85,10,20,95,30,40.  
h2.backwardprint() # This should print: 40,30,95,20,10,80.  

print()
h2.insert(75,6)
h2.forwardprint() # This should print: 85,10,20,95,30,40,75. 
h2.backwardprint() # This should print: 75,40,30,95,20,10,85. 


print("///  Test 05  ///")
a3 = [10, 20, 30, 40, 50, 60, 70]
h3 = DoublyList(a3) # uses the constructor
h3.forwardprint() # This should print: 10,20,30,40,50,60,70.  

# removes at the given index. returns element of the removed node. Check validity of index. return None if index is invalid.
print("Removed element: "+ h3.remove(0)) # This should print: Removed element: 10
h3.forwardprint() # This should print: 20,30,40,50,60,70.  
h3.backwardprint() # This should print: 70,60,50,40,30,20.  
print("Removed element: "+ h3.remove(3)) # This should print: Removed element: 50
h3.forwardprint() # This should print: 20,30,40,60,70.  
h3.backwardprint() # This should print: 70,60,40,30,20.  
print("Removed element: "+ h3.remove(4)) # This should print: Removed element: 70
h3.forwardprint() # This should print: 20,30,40,60. 
h3.backwardprint() # This should print: 60,40,30,20.
