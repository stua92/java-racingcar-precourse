# 자동차 경주 게임
## 요구사항
- 숫자 야구 게임 요구사항을 파악한다.
- 코드 컨벤션 준수 
- 특히 기능을 구현하기 전에 기능 목록을 생성, 기능별로 commit
- 단일책임의 원칙을 준수 
- 코드 depth 2미만으로 코드 작성
- jUnit5 AssertJ로 핵심 기능 단위 테스트 구현
- 일급 콜렉션을 사용한다.
- 모든 원시값과 문자열을 포장한다.

## 기능 목록

1. 이름, 트랙 위치, 랜덤숫자를 가지고 있는 클래스
    -> Car class
    1. 이름, 현재 위치, 회차별 랜덤숫자를 가지고 있는 객체
    2. action 메소드로 track을 +1 증가
    3. drawNumber 메소드로 랜덤 숫자를 생성

2. 자동차들의 목록을 가지고 있는 리스트 클래스
    -> RunningCars class
    1. 일급 콜렉션 사용 (불변 객체) 
    2. 콜렉션을 포함한 클래스는 반드시 다른 멤버 변수가 없어야 한다.
    3. 각 자동차마다 라운드를 반복 실행할 수 있는 play 메소드
    5. winner 정보를 리턴 

3. 0~9 사이의 랜덤 값을 생성하는 클래스
    -> CarRandomValueGenerator class
    1. createRandomValu 메소드로 랜덤 숫자 생성
    2. randomValueValidationCheck 랜덤 숫자 범위 예외 여부를 검사

5. 4 or over 인지 판단하는 클래스 
    -> MoveCar class
    1. 4 이상이면 RUN 리턴
    2. 3 이하이면 STOP 리턴

6. 출력을 위한 print 클래스 
    -> PrintMessage class
