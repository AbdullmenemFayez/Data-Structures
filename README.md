
<h1>Data Structures</h1>
<h4>"Made by Scientific CSE PTUK"</h4>


* [Some summary](#Some_Summary)
* [Time Complexity](#TimeComlexity)
* [Array](#Array)
* [ArrayList](#ArrayList)
* [LinkedList](#LinkedList)
* [Stack](#Stack)
* [Queue](#Queue)
* [Hash](#Hash)
* [Binary Tree](#BinaryTree)
* [Binary Search Tree](#BinarySearchTree)
* [BFS](#BFS)
* [AVL Tree](#AVLTree)
* [Sort](#sort)
* [Output](#Output)
* [some Questions](#Questions)





## Some_Summary

* <a href = "https://github.com/AbdullmenemFayez/Data-Structures/files/9434792/Big.O.Notation.pdf" target = "_blank">Big O Notation</a>

* <a href = "https://drive.google.com/drive/folders/1UZHAs9sN_H-9OFry-GuQdGjrcdXp2iP5" target ="_blank">Data Structures :3</a>

* <a href = "https://mega.nz/file/eeph3JrA#spfbxMtIAXJ_ssDA1MLximAX0rBgcoAipW1lmk_9YTc" target = "_blank">Data Structures Aseel</a>

* <a href = "https://mega.nz/file/KSpxDbCB#lLc0QhVnwZQD9dx99_TuQXUj1KhOKnf28P2Dd6vuf4w" target = "_blank">Data Structures Hadeel</a>




## TimeComlexity

<b>the time complexity is the computational complexity that describes the amount of computer time it takes to run an algorithm.</b> 

In order to calculate time complexity on an algorithm, it is assumed that a constant time c is taken to execute one operation, and then the total operations for an input length on N are calculated.


* [Time Comlexity video](https://www.youtube.com/watch?v=sHhVsGQz9MI&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=3)

``` java
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



            }
        }
  ```      
<h4><a href = "https://mega.nz/folder/6D4HkKhJ#Oz-y1xtdmjNScm2rdUPiZg">more example </a></h4>
  
</br>
<img width="1433" alt="Screenshot-2016-07-15-16-16-10" src="https://user-images.githubusercontent.com/86553978/186654152-2564e06b-294b-4acc-82b2-86af18d6a485.png">


<figure class="table"><table><tbody><tr><td style="direction: ltr; text-align: left;"><strong>Input Length</strong></td><td style="direction: ltr; text-align: left;"><strong>Worst Accepted Time Complexity</strong></td><td><p style="text-align: center; direction: ltr;"><strong>Usually type of solutions</strong></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">10 -12</p></td><td><p style="text-align: center; direction: ltr;">O(N!)</p></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/recursion/">Recursion</a> and <a href="https://www.geeksforgeeks.org/backtracking-algorithms/">backtracking</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">15-18</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p style="text-align: center; direction: ltr;">Recursion, backtracking, and<a href="https://www.geeksforgeeks.org/bits-manipulation-important-tactics/"> bit manipulation</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">18-22</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p style="text-align: center; direction: ltr;">Recursion, backtracking, and bit manipulation</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">30-40</p></td><td style="direction: ltr; text-align: left;"><font _mstmutation="1">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;O(2</font><sup>N/2 </sup><font _mstmutation="1">* N)</font></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/meet-in-the-middle/">Meet in the middle</a>, <a href="https://www.geeksforgeeks.org/divide-and-conquer-introduction/">Divide and Conquer</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">100</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>4</sup>)</p></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/dynamic-programming/">Dynamic programming</a>, <a href="https://www.geeksforgeeks.org/basic/constructive-algorithms/">Constructive</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">400</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>3</sup>)</p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, Constructive</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">2K</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>2</sup><font _mstmutation="1">* log N)</font></p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, <a href="https://www.geeksforgeeks.org/binary-search/">Binary Search</a>,<a href="https://www.geeksforgeeks.org/sorting-algorithms/"> Sorting</a>,&nbsp;<br>Divide and Conquer</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">10K</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>2</sup>)</p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, <a href="https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/">Graph</a>, <a href="https://www.geeksforgeeks.org/binary-tree-data-structure/">Trees</a>, Constructive</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">1M</p></td><td><p style="text-align: center; direction: ltr;">O(N* log N)</p></td><td><p style="text-align: center; direction: ltr;">Sorting, Binary Search, Divide and Conquer</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">100M</p></td><td><p style="text-align: center; direction: ltr;">O(N), O(log N), O(1)</p></td><td><p style="text-align: center; direction: ltr;">Constructive, <a href="https://www.geeksforgeeks.org/mathematical-algorithms/">Mathematical,</a> <a href="https://www.geeksforgeeks.org/greedy-algorithms-general-structure-and-applications/">Greedy Algorithms</a></p></td></tr></tbody></table></figure>  



## Array
<b>An array is a collection of items stored at contiguous memory locations. Array is a container which can hold a fix number of items.</b>


![array-2](https://user-images.githubusercontent.com/86553978/187993726-f8100a62-1a84-45b5-815a-f9fa50c92e3a.png)

<a herf ="leetcode.com/problems/two-sum/">Two Sum</a>

</br>







## Output
<h4><a href ="https://mega.nz/folder/reYz3QoY#iMibmi5CwXd1Z08uo12EOg">example<a></h4>
