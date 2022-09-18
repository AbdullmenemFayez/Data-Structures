<h1 align="center">Data Structures</h1>
<h4>"Made by Scientific CSE PTUK"</h4>




- [Some summary](#Some_Summary)
- [Time Complexity](#TimeComlexity)
- [Array](#Array)
- [ArrayList](#ArrayList)
- [LinkedList](#LinkedList)
- [Stack](#Stack)
- [Queue](#Queue)
- [Recursion](#Recursion)
- [Binary Tree](#BinaryTree)
- [Binary Search Tree](#BinarySearchTree)
- [Hash](#Hash)
- [BFS](#BFS)
- [AVL Tree](#AVLTree)
- [Sort](#sort)
- [Output](#Output)
- [some Questions](#Questions)

## Some_Summary

- <a href = "https://github.com/AbdullmenemFayez/Data-Structures/files/9434792/Big.O.Notation.pdf" target = "_blank">Big O Notation</a>

- <a href = "https://drive.google.com/drive/folders/1UZHAs9sN_H-9OFry-GuQdGjrcdXp2iP5" target ="_blank">Data Structures :3</a>

- <a href = "https://mega.nz/file/eeph3JrA#spfbxMtIAXJ_ssDA1MLximAX0rBgcoAipW1lmk_9YTc" target = "_blank">Data Structures Aseel</a>

- <a href = "https://mega.nz/file/KSpxDbCB#lLc0QhVnwZQD9dx99_TuQXUj1KhOKnf28P2Dd6vuf4w" target = "_blank">Data Structures Hadeel</a>

## TimeComlexity

<b>the time complexity is the computational complexity that describes the amount of computer time it takes to run an algorithm.</b>

In order to calculate time complexity on an algorithm, it is assumed that a constant time c is taken to execute one operation, and then the total operations for an input length on N are calculated.

- [Time Comlexity video](https://www.youtube.com/watch?v=sHhVsGQz9MI&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=3)

```java
        class Example{
            void fun(int n){
                for (int i = 0; i < n; i++) {
                     System.out.println(n);

                }// Time O(n)



                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println(n)
                    }
                }// O(n * n)


                for (int i = 0 ; i < n ; i++){
                    int j = n ;
                    while(j != 0){
                        j /= 2;
                    }

                }// O(n * log2(n))


                int i = 0 , j = 0;
                for( ; i < n ; i++){

                    while(j < n )++j;

                }// O(n) ? اللوب الداخلية فقط مرة وحدة تتم

                public int add100(int[] array) {
                    if (array.length < 100) {
                             return 0;
                    }
                    int sum = 0;
                    for (int i = 0; i < 100; i++) {
                               sum += array[i];
                    }
                    return sum;
                }// O(1)

            }
        }
```

<h4><a href = "https://mega.nz/folder/6D4HkKhJ#Oz-y1xtdmjNScm2rdUPiZg">more example </a></h4>
  
</br>
<img width="1433" alt="Screenshot-2016-07-15-16-16-10" src="https://user-images.githubusercontent.com/86553978/186654152-2564e06b-294b-4acc-82b2-86af18d6a485.png">

<figure class="table"><table><tbody><tr><td style="direction: ltr; text-align: left;"><strong>Input Length</strong></td><td style="direction: ltr; text-align: left;"><strong>Worst Accepted Time Complexity</strong></td><td><p align="center"><strong>Usually type of solutions</strong></p></td></tr><tr><td><p align="center">10 -12</p></td><td><p align="center">O(N!)</p></td><td><p align="center"><a href="https://www.geeksforgeeks.org/recursion/">Recursion</a> and <a href="https://www.geeksforgeeks.org/backtracking-algorithms/">backtracking</a></p></td></tr><tr><td><p align="center">15-18</p></td><td><p align="center"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p align="center">Recursion, backtracking, and<a href="https://www.geeksforgeeks.org/bits-manipulation-important-tactics/"> bit manipulation</a></p></td></tr><tr><td><p align="center">18-22</p></td><td><p align="center"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p align="center">Recursion, backtracking, and bit manipulation</p></td></tr><tr><td><p align="center">30-40</p></td><td style="direction: ltr; text-align: left;"><font _mstmutation="1">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;O(2</font><sup>N/2 </sup><font _mstmutation="1">* N)</font></td><td><p align="center"><a href="https://www.geeksforgeeks.org/meet-in-the-middle/">Meet in the middle</a>, <a href="https://www.geeksforgeeks.org/divide-and-conquer-introduction/">Divide and Conquer</a></p></td></tr><tr><td><p align="center">100</p></td><td><p align="center"><font _mstmutation="1">O(N</font><sup>4</sup>)</p></td><td><p align="center"><a href="https://www.geeksforgeeks.org/dynamic-programming/">Dynamic programming</a>, <a href="https://www.geeksforgeeks.org/basic/constructive-algorithms/">Constructive</a></p></td></tr><tr><td><p align="center">400</p></td><td><p align="center"><font _mstmutation="1">O(N</font><sup>3</sup>)</p></td><td><p align="center">Dynamic programming, Constructive</p></td></tr><tr><td><p align="center">2K</p></td><td><p align="center"><font _mstmutation="1">O(N</font><sup>2</sup><font _mstmutation="1">* log N)</font></p></td><td><p align="center">Dynamic programming, <a href="https://www.geeksforgeeks.org/binary-search/">Binary Search</a>,<a href="https://www.geeksforgeeks.org/sorting-algorithms/"> Sorting</a>,&nbsp;<br>Divide and Conquer</p></td></tr><tr><td><p align="center">10K</p></td><td><p align="center"><font _mstmutation="1">O(N</font><sup>2</sup>)</p></td><td><p align="center">Dynamic programming, <a href="https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/">Graph</a>, <a href="https://www.geeksforgeeks.org/binary-tree-data-structure/">Trees</a>, Constructive</p></td></tr><tr><td><p align="center">1M</p></td><td><p align="center">O(N* log N)</p></td><td><p align="center">Sorting, Binary Search, Divide and Conquer</p></td></tr><tr><td><p align="center">100M</p></td><td><p align="center">O(N), O(log N), O(1)</p></td><td><p align="center">Constructive, <a href="https://www.geeksforgeeks.org/mathematical-algorithms/">Mathematical,</a> <a href="https://www.geeksforgeeks.org/greedy-algorithms-general-structure-and-applications/">Greedy Algorithms</a></p></td></tr></tbody></table></figure>

<h2>________________________________________________________</h2>

## Array

<b>An array is a collection of items stored at contiguous memory locations. Array is a container which can hold a fix number of items.</b>
</br>
<a href ="https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm" >for more</a>

![array-2](https://user-images.githubusercontent.com/86553978/187993726-f8100a62-1a84-45b5-815a-f9fa50c92e3a.png)

<a href = "https://leetcode.com/problems/two-sum/"><b>Two Sum</b></a>

<a href ="https://leetcode.com/problems/contains-duplicate/"><b>Contains Duplicate</b></a>

<a href ="https://leetcode.com/problems/maximum-subarray/"><b> Maximum Subarray</b></a>
</br>

<h2>________________________________________________________</h2>

## ArrayList

<b>An ArrayList, or dynamically resizing array, allows you to have the benefits of an array while offering flexibility in size. You won’t run out of space in the ArrayList since it’s capacity will grow as you insert elements.</b>

![0_5w9-ibvGwT1EpeH9](https://user-images.githubusercontent.com/86553978/187999731-eb99cae8-40a1-4bef-8c4d-59414b093999.png)

<a href="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Non_generic/ArrayList"><b>Here Implementation of ArrayList</a>
</br>
<a href = "https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Generic/ArrayList"><b>ArrayList Implementation Generic Data type</b></a>


</br>
<a href = "https://leetcode.com/problems/pascals-triangle/">Pascal's Triangle</a>

<h2>________________________________________________________</h2>

## LinkedList
<b>A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers as shown in the below image:</b>

![OIP](https://user-images.githubusercontent.com/86553978/188838560-41cc881b-1123-4458-928e-168c9ee7443d.jpg)



<h7><a href ="https://www.youtube.com/watch?v=R9PTBwOzceo"><b>Introduction to Linked List</b></a></h7>

<h7><a href ="https://leetcode.com/problems/design-linked-list/">Design Linked List</a></h7>


<h4><b>Linked List Vs Array</b></h4>

![Screenshot20220525085154](https://user-images.githubusercontent.com/86553978/188868038-3aa4e144-7c6a-443f-805a-5ba6350f2ff2.png)






<a href ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Non_generic/LinkedLists">Here Implementation of Linked list</a>

<a herf ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Generic/LinkedLists">Linked List Implementation Generic Data type</a>

<h4>some qustion</h4>

* [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
* [Delete Node in a Linked List ._.](https://leetcode.com/problems/delete-node-in-a-linked-list/)
* [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
* [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

* [<h4>‘Quizzes’ on Linked List</h4>](https://www.geeksforgeeks.org/data-structure-gq/linked-list-gq/)

<h2>________________________________________________________</h2>

## Stack

<div>
<b>
 Stack is A collection based on the principle of adding 
elements and retrieving them in the opposite order.

Last-In, First-Out ("LIFO")

- Elements are stored in order of insertion.
- We do not think of them as having indexes.
- Client can only add/remove/examine 
the last element added (the "top").
</b></div>

![Applications-of-Stack](https://user-images.githubusercontent.com/86553978/188878337-396acb1e-f547-4d06-acc9-afe095e4e498.png)

<a href ="https://www.youtube.com/watch?v=9BZlgbZFR_c&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=5">Introduction Stack Using Linked List</a>


<a href ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Non_generic/Stacks">Here Implementation of  Stack </a>

<a href ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Generic/Stacks">Stack Implementation Generic Data type</a>
<h4>some qustion</h4>

* [Implement stack using array](https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&category[]=Stack&sortBy=submissions)

* [Get minimum element from stack](https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1?page=1&category[]=Stack&sortBy=submissions)

<h2>________________________________________________________</h2>


## Queue 

<b> queue: Retrieves elements in the order they were added.</b>
* First-In, First-Out ("FIFO")
* Elements are stored in order of
insertion but don't have indexes.
*  Client can only add to the end of the
queue, and can only examine/remove
the front of the queue


![Queue](https://user-images.githubusercontent.com/86553978/189496345-42c65b8d-6e9c-4de7-bcdd-a23546467011.png)


<a href ="https://www.youtube.com/watch?v=8t_tzT52br8&t=389s">Queue Introduction(Simple Queue vs Circular Queue Using Array)</a>
<a href = "https://www.youtube.com/watch?v=VhRKjM759W8&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=12"> Queue Using Linked List</a>


<a href ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Non_generic/Queues">Here Implementation of  Queue </a>

<a href ="https://github.com/AymanAttili/DataStructures/tree/master/src/com/DataStructures/Generic/Queues">Queue Implementation Generic Data type</a>

<h4>some qustion</h4>

* [Queue using two Stacks](https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category[]=Queue&sortBy=submissions)

* [Queue Reversal](https://practice.geeksforgeeks.org/problems/queue-reversal/1?page=1&category[]=Queue&sortBy=submissions)

* [‘Quizzes’ on Queue](https://www.geeksforgeeks.org/data-structure-gq/queue-gq/)
<h2>________________________________________________________</h2>

## Recursion

<b>

 recursion: The definition of an operation in terms of itself.
 * <u><h7>Solving a problem using recursion depends on solving
smaller occurrences of the same problem.<h7></u></b>

 recursive programming: Writing methods that call 
themselves to solve problems recursively

* An equally powerful substitute for iteration (loops)
* Particularly well-suited to solving certain types of problems like Tree 

when you need using Recursion you should know two things :

     1  -  Getting down one stair 

     2- Recognizing the bottom

* Most code will look like:

        if (simplest case){
            compute and return solution
        } else{
            divide into similar subproblem (s)
                    solve each subproblem recursively
            assemble the overall solution
        }

Evrey recursive algorithm involves at least 2 cases:

* base Case : A simple occurrence that can be answered 
directly.

* recursive case: A more complex occurrence of the problem 
that cannot be directly answered, but can instead be described 
in terms of smaller occurrences of the same problem.

* Some recursive algorithms have more than one base or 
recursive case, but all have at least one of each.
*  A crucial part of recursive programming is identifying these 
cases.

<h5>Recursion vs Iteration</h5>

```java
    public static void fun(int n) {
        while (n > 0) {

            System.out.print(n); // small piece of problem

            n--; // make the problem smaller
        }
        System.out.println(); // Base case n == 0
    }

    public static void fun(int n) {
        if (n == 0) {
            System.out.println(); // Base case n == 0
        } else {
            System.out.print(n); // small piece of problem

            fun(n - 1); // make the problem smaller
        }
    }    
```

</b>
<h2>________________________________________________________</h2>

## BinaryTree

* <b>Tree</b> :  Nodes linked together in some hierarchical fashion (Nonlinear data structure)

* <b>Binary Tree</b> : One where each node has at most two 
children.



        
![Screenshot 2022-09-18 200451](https://user-images.githubusercontent.com/86553978/190919532-d2e3b813-b1d3-4131-b546-38eae2918fe5.png)


* <h5>A tree is either:</h5> 

_ empty(null), or

_ A root node that contains :
         
         * data
         * A left subtree 
         * A right subtree
             _ The left and / or right subtrre could  be empty


![Screenshot 2022-09-18 201155](https://user-images.githubusercontent.com/86553978/190919944-cb0ca8a2-9941-46b7-ba0a-28207fa26e97.png)

Terminology : 

* node: an object containing a data value and left/right 
children
* root: topmost node of a tree
* leaf: a node that has no children
* branch: any internal node; neither the root nor a leaf
* parent: a node that refers to this one
* child: a node that this node refers to
* sibling: a node with a common parent
* subtree: the smaller tree of nodes on
the left or right of the current node
* height: length of the longest path
from the root to any node
* level or depth: length of the path
from a root to a given node

![Tree Term](https://user-images.githubusercontent.com/86553978/190920897-22c5b0b5-744e-483e-9b6a-1789b2574e47.gif)


<h4>Types binary trees</h4>

* Full (Strictly)Binary tree 
,If every node has zero or two children .

![Screenshot 2022-09-18 204623](https://user-images.githubusercontent.com/86553978/190921591-00c1c76b-75a1-4e71-a028-fd8ad12cc7ec.png)

        
* Complete Binary tree:

  A- All levels is completely filled except the last level.
        
![Screenshot 2022-09-18 204654](https://user-images.githubusercontent.com/86553978/190921600-e2098320-9658-4fd1-921e-6394b0f15cf8.png)

  
  B- All Nodes as left as possible in last level

![Screenshot 2022-09-18 204709](https://user-images.githubusercontent.com/86553978/190921611-ba689813-0606-4474-aa88-5a5dffea199a.png)

        
* Perfect Binary tree :
A. Every Nodes has two children

B. All leaves are at the same level

![Screenshot 2022-09-18 204726](https://user-images.githubusercontent.com/86553978/190921617-2ed22681-b367-406a-ae70-755f6ef80476.png)


 <h4>Print IntTree</h4>    

``` java
private void print(TreeNode root){
    if(root != null){
        System.out.print(root.val + " " );
        print(root.left);
        print(root.right);
    }
}
```   
<h5>Traversals :</h5>

* PreOrder : process root node, then its left/right subtrees.

* InOrder : process left subtree, then root node, then right.
* PostOrder : process left/right subtrees, then root node.

``` java
    private void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }//output: 17 41 29 9 81 40

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }// output: 29 41 17 81 9 40

    private void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }// 29 41 81 40 9 17




```


<h2>________________________________________________________</h2>

## Output

<h4><a href ="https://mega.nz/folder/reYz3QoY#iMibmi5CwXd1Z08uo12EOg">example<a></h4>
