# elasticsearch

[도서관 정보나루](https://www.data4library.kr)에서 제공되는 서울 소재 도서관 332관 약 1,700만권의 책 데이터를 삽입하였습니다.
<br>
<br>
<br>

## Data example
|번호|도서명|저자|주제분류번호|ISBN|도서관이름|발행년도|출판사|권|
|---|------------|------|---|----------|------------|---|--------|---|
|1|불편한 편의점|김호연|813.7|9791161571188|갈산도서관|2021|나무옆의자||

<br>
<br>
<br>

## Issues
<details>
    <summary>
        <b>오픈API를 사용하여 데이터를 받는데 속도가 너무 느림</b>
    </summary>
<br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>문제점:</b> 오픈 API를 사용시 1000건의 데이터당 10초 60,000건의 데이터에는 1시간 이상 소요된다. 
  <br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>해결방안:</b> csv파일로 DB에 저장해보자!
</details>
<details>
    <summary>
        <b>csv파일 데이터 깨짐 현상</b>
    </summary>
<br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>문제점1:</b> csv파일은 컬럼을 ',' 구분자로 나누는데 도서명에 ,가 있다면 분리에 어려움이 있다.
  <br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>문제점2:</b> 목록구분기호를 '|'로 변경 엑셀에서 csv로 변경할 때 일부 한글 및 다수의 언어 깨짐 발생. (ansi->utf-8)   
  <br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>해결방안:</b> 엑셀파일로 DB에 저장해보자!
</details>
<details>
    <summary>
        <b>엑셀 heap 메모리 초과오류</b>
    </summary>
<br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>문제점:</b> 엑셀 파일이 큰 경우 heap 메모리 오류 발생.
  <br>
  &nbsp;&nbsp;&nbsp;&nbsp; <b>해결방안:</b> 컴퓨터환경에 맞춰 기준점을 정하고 엑셀 파일을 분리하여 데이터를 적재해보자!
</details>

## 채택
csv파일보다 느리지만 보다 정확한 데이터 구축을 위해 엑셀로 결정하였습니다.
