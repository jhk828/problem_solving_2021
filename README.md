# Algorithm

-------------------

> - since 210119~
>
> - 1일 1 commit  목표
> - 문제 사이트별로, 날짜 순으로 기록합니다.
> - README에 기록하지 않으며 풀던 문제들은 복습하며 추가 중 입니다.



## 백준

| 문제번호                                       | 풀이                                                         | 문제명             | 분류                  | 날짜                      | memo                                                         | 복습 필요 |
| ---------------------------------------------- | ------------------------------------------------------------ | ------------------ | --------------------- | ------------------------- | ------------------------------------------------------------ | --------- |
| [1158](https://www.acmicpc.net/problem/1158)   | [1158](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1158_%EC%9A%94%EC%84%B8%ED%91%B8%EC%8A%A4%EB%AC%B8%EC%A0%9C.java) | 요세푸스문제       | `큐`                  | 21/02/09                  |                                                              | ☑         |
| [1260](https://www.acmicpc.net/problem/1260)   | [1260](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1260_DFS%EC%99%80BFS.java) | DFS와 BFS          | `DFS` `BFS`           | 21/02/12<br />21/03/16    |                                                              |           |
| [2206](https://www.acmicpc.net/problem/2206)   | [2206](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_2206_%EB%B2%BD%EB%B6%80%EC%88%98%EA%B3%A0%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0.java) | 벽 부수고 이동하기 | `BFS`                 | 21/02/14<br />21/03/17    | [1. visited 배열 3차 -> 벽 부실때, 부시지 않을 때 구분<br />2. 전에 벽을 부셨을 때 보다 더 적은 칸수로 나아갈 수 x](https://jhk0307.tistory.com/302) |           |
| [9663](https://www.acmicpc.net/problem/9663)   | [9663](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_9663_NQueen.java) | N-Queen            | `백트랙킹`            | 21/03/02                  | [1행/ 1열/ 1대각선 -> 1퀸](https://jhk0307.tistory.com/328)  |           |
| [17135](https://www.acmicpc.net/problem/17135) | [17135](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_17135_%EC%BA%90%EC%8A%AC%EB%94%94%ED%8E%9C%EC%8A%A4.java) | 캐슬 디펜스        | `시뮬레이션`          | 21/03/04                  | **A형 기출**<br />[1) 궁수들이 동시에 여러 적을 노릴 수 있음<br />2) Class의 `compareTo()` 재정의하여 사용하기](https://jhk0307.tistory.com/337) |           |
| [17406](https://www.acmicpc.net/problem/17406) | [17406](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_17406_%EB%B0%B0%EC%97%B4%EB%8F%8C%EB%A6%AC%EA%B8%B04_2.java) | 배열 돌리기4       | `시뮬레이션` `순열`   | 21/02/10<br />21/03/05    | **A형 기출** <br />[1) 배열 복사해서 rotate()해야 다음 경우에 영향 x<br />2) `map[or][oc]` <- `map[nr][nc]` 순서 / 회전 순서 유의](https://jhk0307.tistory.com/300) |           |
| [3109](https://www.acmicpc.net/problem/3109)   | [3109](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_3109_%EB%B9%B5%EC%A7%91.java) | 빵집               | `DFS` `백트랙킹`      | 21/02/20<br />21/03/06    | [가지치기 2가지<br />1) 성공하여 return true를 한 경우 다음 방향으로 탐색x<br />2) 3방 모두 탐색 불가능해도 `visited[r][c]`값 초기화x](https://jhk0307.tistory.com/327) |           |
| [17070](https://www.acmicpc.net/problem/3109)  | [17070](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_17070_%ED%8C%8C%EC%9D%B4%ED%94%84%EC%98%AE%EA%B8%B0%EA%B8%B01.java) | 파이프 옮기기1     | `시뮬레이션` `DFS`    | 21/03/06<br />21/03/15    | 방향(가로 / 세로 / 대각선)마다 다른 이동조건 확인<br /><br />두번째 파이프 위치만 가지고 풀기 | ☑         |
| [17281](https://www.acmicpc.net/problem/17281) | [17281](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_17281_%EC%95%BC%EA%B5%AC_fail.java) | ⚾                  |                       | 21/03/09 ~ <br />21/03/10 | **A형 기출**<br />**미해결** - 순열/ nextPermutation으로 푸는 중 | ☑         |
| [16236](https://www.acmicpc.net/problem/16236) | [16236](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_16236_%EC%95%84%EA%B8%B0%EC%83%81%EC%96%B4.java) | 아기상어           | `BFS`                 | 21/03/15<br />21/03/17    | [ArrayList Sort, Comparable, for each](https://jhk0307.tistory.com/344) |           |
| [1759](https://www.acmicpc.net/problem/1759)   | [1759](https://github.com/jhk828/Algorithm/blob/b7cea277fe4b574d3c24a19626dfeefc197dfa17/BJ/Main_BJ_1759_%EC%95%94%ED%98%B8%EB%A7%8C%EB%93%A4%EA%B8%B0.java) | 암호만들기         | `조합` `DFS` `정렬`   | 21/03/16                  |                                                              |           |
| [14889](https://www.acmicpc.net/problem/14889) | [14889](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_14889_%EC%8A%A4%ED%83%80%ED%8A%B8%EC%99%80%EB%A7%81%ED%81%AC.java) | 스타트와 링크      | `조합` `DFS`          | 21/03/17                  |                                                              |           |
| [17471](https://www.acmicpc.net/problem/17471) | [17471](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_17471_%EA%B2%8C%EB%A6%AC%EB%A9%98%EB%8D%94%EB%A7%81.java) | 게리멘더링         | `DFS` `BFS` `그래프`  | 21/03/18<br />21/03/19    | **A형 기출**                                                 | ☑         |
| [1753](https://www.acmicpc.net/problem/1753)   | [1753](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1753_%EC%B5%9C%EB%8B%A8%EA%B2%BD%EB%A1%9C.java) | 최단경로           | `최단경로` `Dijkstra` | 21/03/22                  |                                                              | ☑         |
| [1786](https://www.acmicpc.net/problem/1786)   | [1786](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1786_%EC%B0%BE%EA%B8%B0.java) | 찾기               | `문자열패턴` `KMP`    | 21/03/22                  |                                                              |           |
| [1463](https://www.acmicpc.net/problem/1463)   | [1463](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1463_1%EB%A1%9C%EB%A7%8C%EB%93%A4%EA%B8%B0.java) | 1로 만들기         | `DP`                  | 21/03/23                  | [n=1일 때는 값이 1이 아니라 0이다](https://jhk0307.tistory.com/347) | ☑         |
| [1149](https://www.acmicpc.net/problem/1149)   | [1149](https://github.com/jhk828/Algorithm/blob/master/BJ/Main_BJ_1149_RGB%EA%B1%B0%EB%A6%AC.java) | RGB 거리           | `DP`                  | 21/03/23                  | [.](https://jhk0307.tistory.com/348)                         |           |
| [2636](https://www.acmicpc.net/problem/2636)   | 2636                                                         | 치즈               | `BFS` `시뮬레이션`    | 21/03/24                  | [내부/외부 구분 / `DFS`로 풀어보기](https://jhk0307.tistory.com/350) | ☑         |
| [1600](https://www.acmicpc.net/problem/1600)   | 1600                                                         | 말이되고픈원숭이   | `BFS` 시뮬레이션      | 21/03/24                  | [3차원 visited 배열](https://jhk0307.tistory.com/351)        |           |



## SWEA

| 문제번호                                                     | 풀이                                                         | 문제명                           | 분류                        | 날짜                   | memo                                                         | 복습 필요 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------- | --------------------------- | ---------------------- | ------------------------------------------------------------ | --------- |
| [1873](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LyE7KD2ADFAXc&categoryId=AV5LyE7KD2ADFAXc&categoryType=CODE&problemTitle=%EB%B0%B0%ED%8B%80&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [1873](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D3_1873_%EC%83%81%ED%98%B8%EC%9D%98%EB%B0%B0%ED%8B%80%ED%95%84%EB%93%9C.java) | 상호의 배틀필드                  | `시뮬레이션`                | 21/02/03               |                                                              | ☑         |
| [9229](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AW8Wj7cqbY0DFAXN&categoryId=AW8Wj7cqbY0DFAXN&categoryType=CODE&problemTitle=%ED%95%9C%EB%B9%88&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [9229]()                                                     | 한빈이와 Spot Mart               | `부분집합` `조합`           | 21/02/08               | 부분집합으로 nCr 구하기<br />`total`값을 부분집합 파라미터로 넘기기 |           |
| [5215](swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWT-lPB6dHUDFAVT&categoryId=AWT-lPB6dHUDFAVT&categoryType=CODE&problemTitle=%ED%96%84%EB%B2%84%EA%B1%B0&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [5215](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D3_5215_%ED%96%84%EB%B2%84%EA%B1%B0%EB%8B%A4%EC%9D%B4%EC%96%B4%ED%8A%B8.java) | 햄버거 다이어트                  | `부분집합`                  | 21/02/08               | `total`값을 부분집합 파라미터로 넘기기                       |           |
| [6808](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWgv9va6HnkDFAW0&categoryId=AWgv9va6HnkDFAW0&categoryType=CODE&problemTitle=%EC%B9%B4%EB%93%9C%EA%B2%8C%EC%9E%84&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [6808](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D3_6808_%EA%B7%9C%EC%98%81%EC%9D%B4%EC%99%80%EC%9D%B8%EC%98%81%EC%9D%B4%EC%9D%98%EC%B9%B4%EB%93%9C%EA%B2%8C%EC%9E%84_2.java) | 규영이와 인영이의 <br />카드게임 | `순열` `DFS`                | 21/02.14<br />21/03/13 | 순열로 팩토리얼                                              |           |
| [4012](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeUtVakTMDFAVH&categoryId=AWIeUtVakTMDFAVH&categoryType=CODE&problemTitle=4012&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1&&&&&&&&&#none) | [4012](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_%EB%AA%A8%EC%9D%98_4012_%EC%9A%94%EB%A6%AC%EC%82%AC_2.java) | 요리사                           | `부분집합`                  | 21/02/19<br />21/03/14 | [부분집합으로 nCr 구하기](https://jhk0307.tistory.com/341)   |           |
| [3234](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWAe7XSKfUUDFAUw&categoryId=AWAe7XSKfUUDFAUw&categoryType=CODE&problemTitle=%EC%A4%80%ED%99%98&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [3234](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D4_3234_%EC%A4%80%ED%99%98%EC%9D%B4%EC%9D%98%EC%96%91%ED%8C%94%EC%A0%80%EC%9A%B8.java) | 준환이의 양팔저울                | `순열` `DFS`                | 21/02/19               |                                                              | ☑         |
| [1767](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV4suNtaXFEDFAUf&categoryId=AV4suNtaXFEDFAUf&categoryType=CODE&problemTitle=1767&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1&&&&&&&&&) | [1767](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D_1767_%ED%94%84%EB%A1%9C%EC%84%B8%EC%84%9C%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0_2.java) | 프로세서 연결하기                | `부분집합` `백트래킹` `DFS` | 21/02/25<br />21/03/01 | [1) 전선 교차x <br />2) 4방향 모두 탐색할 필요 x](https://jhk0307.tistory.com/335) |           |
| [1749](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PoOKKAPIDFAUq&categoryId=AV5PoOKKAPIDFAUq&categoryType=CODE&problemTitle=1949&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1&&&&&&&&&) | [1749](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_%EB%AA%A8%EC%9D%98_1949_%EB%93%B1%EC%82%B0%EB%A1%9C%EC%A1%B0%EC%84%B1.java) | 등산로 조성                      | `DFS`                       | 21/03/11               | 새 위치의 등산로를 깎을 때, 현재값-1로 깎기 X                |           |
| [1952](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PpFQaAQMDFAUq&categoryId=AV5PpFQaAQMDFAUq&categoryType=CODE&problemTitle=%EC%88%98%EC%98%81%EC%9E%A5&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [1952](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_%EB%AA%A8%EC%9D%98_1052_%EC%88%98%EC%98%81%EC%9E%A5.java) | 수영장                           | `DFS`                       | 21/03/11               | `DP`로도 풀어보기                                            |           |
| [10966](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXWXMZta-PsDFAST&categoryId=AXWXMZta-PsDFAST&categoryType=CODE&problemTitle=10966&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [10966](https://github.com/jhk828/Algorithm/blob/da93dad54800401aaecf45b0e859216a18c03239/SW%20Expert/Solution_D4_10966_%EB%AC%BC%EB%86%80%EC%9D%B4%EB%A5%BC%EA%B0%80%EC%9E%90.java) | 물놀이를 가자                    | `BFS`                       | 21/03/15               | [bfs는 여러개의 지점 동시 탐색](https://jhk0307.tistory.com/343) |           |
| [1227](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14wL9KAGkCFAYD&categoryId=AV14wL9KAGkCFAYD&categoryType=CODE&problemTitle=%EB%AF%B8%EB%A1%9C2&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [1227](https://github.com/jhk828/Algorithm/blob/5cd65b89205cfcf18d469ed8fe7825f1eda952be/SW%20Expert/Solution_D4_1227_%EB%AF%B8%EB%A1%9C2.java) | 미로2                            | `BFS`                       | 21/03/15               |                                                              |           |
| [8382](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWyNQrCahHcDFAVP&categoryId=AWyNQrCahHcDFAVP&categoryType=CODE&problemTitle=8382&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [8382](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D4_8382_%EB%B0%A9%ED%96%A5%EC%A0%84%ED%99%98_2.java) | 방향전환                         | `BFS`                       | 21/03/15<br />21/03/22 | [3원 visited 배열](https://jhk0307.tistory.com/342)          | ☑         |
| [4008](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeRZV6kBUDFAVH&categoryId=AWIeRZV6kBUDFAVH&categoryType=CODE&problemTitle=4008&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [4008](https://github.com/jhk828/Algorithm/blob/5cd65b89205cfcf18d469ed8fe7825f1eda952be/SW%20Expert/Solution_%EB%AA%A8%EC%9D%98_4008_%EC%88%AB%EC%9E%90%EB%A7%8C%EB%93%A4%EA%B8%B0.java) | 숫자 만들기                      | `재귀`                      | 21/03/16               | 재귀 함수 시작 인덱스 조심                                   |           |
| [1238](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15B1cKAKwCFAYD&categoryId=AV15B1cKAKwCFAYD&categoryType=CODE&problemTitle=Contact&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | [1238](https://github.com/jhk828/Algorithm/blob/b7cea277fe4b574d3c24a19626dfeefc197dfa17/SW%20Expert/Solution_D4_1238_Contact.java) | Contact                          | `BFS` `Graph`               | 21/03/16               |                                                              |           |
| [1486](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV2b7Yf6ABcBBASw) | [1486](https://github.com/jhk828/Algorithm/blob/master/SW%20Expert/Solution_D4_1486_%EC%9E%A5%ED%9B%88%EC%9D%B4%EC%9D%98%EB%86%92%EC%9D%80%EC%84%A0%EB%B0%98.java) | 장훈이의높은선반                 | `DFS`                       | 21/03/18               | 가지치기 조건들                                              |           |
| [1251](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15StKqAQkCFAYD&categoryId=AV15StKqAQkCFAYD&categoryType=CODE&problemTitle=1251&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | 1251                                                         | 하나로                           | `MST` `Prim` `Kruskal`      | 21/03/24               |                                                              | ☑         |



## Code Up

| 문제번호                                                  | 풀이                                                         | 문제명 | 분류          | 날짜                | memo             | 복습 필요 |
| --------------------------------------------------------- | ------------------------------------------------------------ | ------ | ------------- | ------------------- | ---------------- | --------- |
| [기초 100제](https://codeup.kr/problemsetsol.php?psid=23) | [1~49번](https://github.com/jhk828/Algorithm/tree/master/CodeUp/CodeUp100%EC%A0%9C/1~49)<br />[50~100번](https://github.com/jhk828/Algorithm/tree/master/CodeUp/CodeUp100%EC%A0%9C/50~100) |        | `Java 사용법` | 21/01/19 ~ 21/01/16 | 입출력 방법 주의 |           |



## JUNGOL

| 문제번호                                                     | 풀이                                                         | 문제명         | 분류          | 날짜     | memo                           | 복습 필요 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------- | ------------- | -------- | ------------------------------ | --------- |
| [1863](http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1136&sca=99&sfl=wr_hit&stx=1863) | [1863](https://github.com/jhk828/Algorithm/blob/master/JUNGOL/Main_JO_1863_%EC%A2%85%EA%B5%90.java) | 종교           | `서로소집합`  | 21/03/18 | Union-Find연산, 집합 개수 세기 | ☑         |
| [1681](http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=954&sca=99&sfl=wr_hit&stx=1681) | [1681](https://github.com/jhk828/Algorithm/blob/311758f10e5837695e996bea264ae9aa984e5cff/JUNGOL/Main_JO_1681_%ED%95%B4%EB%B0%80%ED%84%B4%EC%88%9C%ED%99%98%ED%9A%8C%EB%A1%9C.java) | 해밀턴순환회로 | `Graph` `DFS` | 21/03/22 | 1로 돌아올 때 길 있는지 체크   | ☑         |

