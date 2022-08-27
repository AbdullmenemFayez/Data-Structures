
<h1>Data Structures</h1>
<h4>"Made by Scientific CSE PTUK"</h4>


* [A simple summary](#SimpleSummary)
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
* [some Questions](#Questions)




## SimpleSummary

[Big O Notation .pdf](https://github.com/AbdullmenemFayez/Data-Structures/files/9434792/Big.O.Notation.pdf)


## TimeComlexity

<b>the time complexity is the computational complexity that describes the amount of computer time it takes to run an algorithm.</b> 

In order to calculate time complexity on an algorithm, it is assumed that a constant time c is taken to execute one operation, and then the total operations for an input length on N are calculated.


* [Time Comlexity video](https://www.youtube.com/watch?v=sHhVsGQz9MI&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=3)


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




            }
        }
        
</br>
<img width="1433" alt="Screenshot-2016-07-15-16-16-10" src="https://user-images.githubusercontent.com/86553978/186654152-2564e06b-294b-4acc-82b2-86af18d6a485.png">


<figure class="table"><table><tbody><tr><td style="direction: ltr; text-align: left;"><strong>Input Length</strong></td><td style="direction: ltr; text-align: left;"><strong>Worst Accepted Time Complexity</strong></td><td><p style="text-align: center; direction: ltr;"><strong>Usually type of solutions</strong></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">10 -12</p></td><td><p style="text-align: center; direction: ltr;">O(N!)</p></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/recursion/">Recursion</a> and <a href="https://www.geeksforgeeks.org/backtracking-algorithms/">backtracking</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">15-18</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p style="text-align: center; direction: ltr;">Recursion, backtracking, and<a href="https://www.geeksforgeeks.org/bits-manipulation-important-tactics/"> bit manipulation</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">18-22</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(2</font><sup>N </sup><font _mstmutation="1">* N)</font></p></td><td><p style="text-align: center; direction: ltr;">Recursion, backtracking, and bit manipulation</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">30-40</p></td><td style="direction: ltr; text-align: left;"><font _mstmutation="1">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;O(2</font><sup>N/2 </sup><font _mstmutation="1">* N)</font></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/meet-in-the-middle/">Meet in the middle</a>, <a href="https://www.geeksforgeeks.org/divide-and-conquer-introduction/">Divide and Conquer</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">100</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>4</sup>)</p></td><td><p style="text-align: center; direction: ltr;"><a href="https://www.geeksforgeeks.org/dynamic-programming/">Dynamic programming</a>, <a href="https://www.geeksforgeeks.org/basic/constructive-algorithms/">Constructive</a></p></td></tr><tr><td><p style="text-align: center; direction: ltr;">400</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>3</sup>)</p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, Constructive</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">2K</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>2</sup><font _mstmutation="1">* log N)</font></p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, <a href="https://www.geeksforgeeks.org/binary-search/">Binary Search</a>,<a href="https://www.geeksforgeeks.org/sorting-algorithms/"> Sorting</a>,&nbsp;<br>Divide and Conquer</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">10K</p></td><td><p style="text-align: center; direction: ltr;"><font _mstmutation="1">O(N</font><sup>2</sup>)</p></td><td><p style="text-align: center; direction: ltr;">Dynamic programming, <a href="https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/">Graph</a>, <a href="https://www.geeksforgeeks.org/binary-tree-data-structure/">Trees</a>, Constructive</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">1M</p></td><td><p style="text-align: center; direction: ltr;">O(N* log N)</p></td><td><p style="text-align: center; direction: ltr;">Sorting, Binary Search, Divide and Conquer</p></td></tr><tr><td><p style="text-align: center; direction: ltr;">100M</p></td><td><p style="text-align: center; direction: ltr;">O(N), O(log N), O(1)</p></td><td><p style="text-align: center; direction: ltr;">Constructive, <a href="https://www.geeksforgeeks.org/mathematical-algorithms/">Mathematical,</a> <a href="https://www.geeksforgeeks.org/greedy-algorithms-general-structure-and-applications/">Greedy Algorithms</a></p></td></tr></tbody></table></figure>  



    <div class="mtq_question mtq_scroll_item-1" id="mtq_question-15-1"><table class="mtq_question_heading_table"><tbody><tr><td><div class="mtq_question_label">Question 15</div><div id="mtq_stamp-15-1" class="mtq_stamp mtq_correct_stamp"><b>Correct</b></div></td></tr></tbody></table><div id="mtq_question_text-15-1" class="mtq_question_text">What is the time complexity of the below function?
<div><div id="highlighter_546847" class="syntaxhighlighter nogutter  c"><table border="0" cellpadding="0" cellspacing="0"><tbody><tr><td class="code"><div class="container"><div class="line number1 index0 alt2"><code class="c keyword bold">void</code> <code class="c plain">fun(</code><code class="c color1 bold">int</code> <code class="c plain">n, </code><code class="c color1 bold">int</code> <code class="c plain">arr[])</code></div><div class="line number2 index1 alt1"><code class="c plain">{</code></div><div class="line number3 index2 alt2"><code class="c spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="c color1 bold">int</code> <code class="c plain">i = 0, j = 0;</code></div><div class="line number4 index3 alt1"><code class="c spaces">&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="c keyword bold">for</code><code class="c plain">(; i &lt; n; ++i)</code></div><div class="line number5 index4 alt2"><code class="c spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="c keyword bold">while</code><code class="c plain">(j &lt; n &amp;&amp; arr[i] &lt; arr[j])</code></div><div class="line number6 index5 alt1"><code class="c spaces">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</code><code class="c plain">j++;</code></div><div class="line number7 index6 alt2"><code class="c plain">}</code></div></div></td></tr></tbody></table><button class="runIdeBtn" onclick="redirect( 'highlighter_546847', 'c' )">Run on IDE</button></div></div></div><table class="mtq_answer_table"><colgroup><col class="mtq_oce_first"></colgroup><tbody><tr id="mtq_row-15-1-1" onclick="mtq_button_click(15,1,1)" class="mtq_clickable"><td class="mtq_letter_button_td"><div id="mtq_button-15-1-1" class="mtq_css_letter_button mtq_letter_button_0 mtq_css_letter_selected mtq_letter_selected-15-1" alt="Question 15, Choice 1" style="display: none;">A</div><div id="mtq_marker-15-1-1" class="mtq_marker mtq_correct_marker" alt="Correct" style="display: block;"></div></td><td class="mtq_answer_td"><div id="mtq_answer_text-15-1-1" class="mtq_answer_text">O(n)</div></td></tr><tr id="mtq_row-15-2-1" onclick="mtq_button_click(15,2,1)" class="mtq_clickable"><td class="mtq_letter_button_td"><div id="mtq_button-15-2-1" class="mtq_css_letter_button mtq_letter_button_1" alt="Question 15, Choice 2">B</div><div id="mtq_marker-15-2-1" class="mtq_marker mtq_wrong_marker" alt="Wrong"></div></td><td class="mtq_answer_td"><div id="mtq_answer_text-15-2-1" class="mtq_answer_text">O(n^2)</div></td></tr><tr id="mtq_row-15-3-1" onclick="mtq_button_click(15,3,1)" class="mtq_clickable"><td class="mtq_letter_button_td"><div id="mtq_button-15-3-1" class="mtq_css_letter_button mtq_letter_button_2" alt="Question 15, Choice 3">C</div><div id="mtq_marker-15-3-1" class="mtq_marker mtq_wrong_marker" alt="Wrong"></div></td><td class="mtq_answer_td"><div id="mtq_answer_text-15-3-1" class="mtq_answer_text">O(nlogn)</div></td></tr><tr id="mtq_row-15-4-1" onclick="mtq_button_click(15,4,1)" class="mtq_clickable"><td class="mtq_letter_button_td"><div id="mtq_button-15-4-1" class="mtq_css_letter_button mtq_letter_button_3" alt="Question 15, Choice 4">D</div><div id="mtq_marker-15-4-1" class="mtq_marker mtq_wrong_marker" alt="Wrong"></div></td><td class="mtq_answer_td"><div id="mtq_answer_text-15-4-1" class="mtq_answer_text">O(n(logn)^2)</div></td></tr></tbody></table><b><a href="https://www.geeksforgeeks.org/algorithms-gq/analysis-of-algorithms-gq/">Analysis of Algorithms</a>&nbsp;&nbsp;&nbsp;&nbsp;</b><br><b><a href=" https://www.geeksforgeeks.org/algorithms-analysis-of-algorithms-question-13/">Discuss it</a></b><br><br><br><div id="mtq_question_explanation-15-1" class="mtq_explanation" style="display: block;">
[sourcecode language="C"]
void fun(int n, int arr[])
{
    int i = 0, j = 0;
    for(; i &lt; n; ++i)
    {
        j = 0;
        while(j &lt; n &amp;&amp; arr[i] &lt; arr[j])
            j++;
    }
}
[/sourcecode]</div></div>