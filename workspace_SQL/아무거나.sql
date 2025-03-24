SELECT * from emp;
desc emp;

SELECT * from dept;
desc dept;

select * from salgrade;
desc salgrade;

select
    empno, ename, sal
from
    emp;


    
select deptno from emp;

select distinct deptno from emp;



select job from emp;

select distinct job, deptno from emp;


select ename, sal, sal*12+comm, commfrom emp;
    
    
select ename, sal, sal*12+comm as 연봉, comm
from emp;

select ename, sal, sal*12+comm 연봉, comm "인센 티브"
    from emp;
    

SELECT * FROM EMP ORDER BY job, sal desc;


--q2
select distinct job from emp;

--q3
select
    EMPNO AS EMPLOYEE_NO,
    ENAME AS EMPLOYEE_NAME,
    MGR AS MANAGER,
    SAL AS SALARY,
    COMM AS COMMISTTION,
    DEPTNO AS DEPARTMENT_NO
from emp ORDER BY DEPTNO DESC, ENAME ASC;




select *
    from emp
        where deptno = 30;

--95p
select *
    from emp
        where empno = 7782;

--98p
select *
    from emp
        where deptno = 30
            or job = 'CLERK';

select *
    from emp
        where deptno = 30
            and job = 'SALESMAN';

--98P 1MIN
select *
    from emp
        where empno = 7499
            and deptno = 30;

--99p 1min
select *
    from emp
        where deptno = 20
            or job = 'SALESMAN';
            
            
select *
    from emp
        where ename = 'WARD'
            or job = 'CLERK'
            or deptno = 20;
            

select *
    from emp
        where ename = 'WARD'
            or job = 'CLERK'
            AND deptno = 20;




--102p 1min
select *
    from emp
        where sal >= 2500
        and job = 'ANALYST';

select *
    from emp
        where sal >= 3000;

select *
    from emp
        where sal <= 2500 order by sal;


--  ///////////번외
select *
from (
    select *
    from emp
    where ename = 'WARD'
       or job = 'CLERK'
       or deptno = 20
)
fetch first 5 rows only;
--   //////////번외
    
    
select *
    from emp
    where sal >= 2000
        and sal < 3000;
        
select *
    from emp
    where sal != 3000;
    
select *
    from emp
    where sal <> 3000;



--문제 1
select *
    from emp
    where deptno != 20;
--문제 2
select *
    from emp
    where deptno != 20
    and deptno != 10;
--문제 3    
select *
    from emp
    where deptno = 30
    and sal <= 2000;

select *
    from emp
    where not sal = 3000;
--         ㄴ sal != 3000;

select *
    from emp
    where not (sal < 2000 or sal >= 3000);


select *
    from emp
    where job = 'MANAGER'
    OR JOB = 'SALESMAN'
    OR JOB = 'CLERK'
    ORDER BY JOB;

select *
    from emp
    where job NOT IN ('MANAGER','SALESMAN','CLERK')
    ORDER BY JOB;

select *
    from emp
    where deptno in ('10','20');

select *
    from emp
    where deptno not in ('10','20');

select *
    from emp
    where sal between 2000 and 3000;
    
select *
    from emp
    where ename like '_L%';

select *
    from emp
    where mgr like '77%';
    
select *
    from emp
    where ename not like '____';
    
select *
    from emp
    where ename not like '%AM%';


select *
    from emp
    where comm <= 400;

select *
    from emp
    where comm is null;

select *
    from emp
    where comm is not null;
    
select comm, comm + 10 from emp;

select *
    from emp
    where mgr is null;

select *
    from emp
    where deptno = 10
union
select *
    from emp
    where deptno = 20;
    
--    정상
select empno, ename, deptno, sal 
    from emp
    where deptno = 10
union
select empno, ename, deptno, sal
    from emp
    where deptno = 20;
    
--    타입이같아 나오는 경우
select ename, empno, sal, deptno
    from emp
    where deptno = 10
union
select empno, ename, deptno, sal
    from emp
    where deptno = 20;

--중복과 관계없이 표시
select empno, ename, deptno, sal 
    from emp
    where deptno = 10
union all
select empno, ename, deptno, sal
    from emp
    where deptno = 10;


--126p
--Q1
select *
    from emp
    where ename like '%S';

--Q2
select EMPNO, ENAME, JOB, SAL, DEPTNO
    from emp
    where deptno = 30
    and job = 'SALESMAN';

--Q3_1
select empno, ename, job, sal, deptno
    from emp
    where deptno in (20, 30)
    and sal > 2000;
--Q3_2

--내가 교집합을 사용해 뽑아온 코드
--실무에서사용하지않는이유, 비효율적이고 낭비가 심함.
--나 : 필요없는것까지끌어온후에 집합을 하는것과
--쌤 : 미리 걸러내서 합치는게 다른의미다
--select empno, ename, job, sal, deptno
--    from emp
--    where deptno in(20, 30)
--INTERSECT
--select empno, ename, job, sal, deptno
--    from emp
--    where sal > 2000;

select empno, ename, job, sal, deptno
    from emp
    where sal > 2000
    and deptno = 20
union all
select empno, ename, job, sal, deptno
    from emp
    where sal > 2000
    and deptno = 30;

--Q4
select *
    from emp
    where sal < 2000 or sal > 3000;
--    sal 열값이 2000이상 3000이하 범위 이외의 값
--    다르게생각하면 2000미만 3000초과 라고생각할수있음

--Q5
select ename, empno, sal, deptno
    from emp
    where ename like '%E%'
    and deptno = 30
    and sal not between 1000 and 2000;
    
--Q6
select *
    from emp
    where comm is null
    and mgr is not null
    and job in ('MANAGER','CLERK')
    and ename not like '_L%';
    
select * from dual;

select upper('abcde')
from dual;

select lower(ename) from emp;

select upper(ename) from emp;

select * from emp
    where ename like '%A%' or ename like '%a%';

select length('abc'), length('한글') from dual;

select ename, length('ename') from emp
where length(ename) >= 5;


select length('한'), lengthb('한') from dual;

select '123456', substr('123456', 3, 2) from dual;
select '123456', substr('123456', 2, 3) from dual;

--문자추출 134p
select
    job,
    substr(job, 0, 2) as a,
    substr(job, 3, 3) as b,
    substr(job, 4) as c,
    substr(job, 4, 100)as d,
    substr(job, 14, 100)as e,
    length(substr(job, 4)) as i,
    substr(job, -3, 2) as f,
    substr(job, length(job))as g,
    substr(job, -3) as h
from emp;

--135p 실습 6-7
select
    job,
    substr(job,1,2),
    substr(job,3,4),
    substr(job,5)
    from emp;


select
    job,
    substr(job,-length(job))as a,
    substr(job,-length(job),2) as b,
    substr(job, -3) as c
    from emp;;

--숫자 추출
select substr(12345,2)
from dual;

select
    '010-0100-1100' as a,
    replace('010-0100-1100', '-', ' ') as b,
    replace('010-0100-1100', '-') as c
from dual;

--A를 하트로
select
    ename,
    replace(ename,'A','💔')
from emp;

select
    job,
    length(substr(job, 3)) as i
from emp;



--추가문제
--1q
select
    ename,
    substr(ename, 0, 2)
from emp;
--2q
select
    ename,
    replace(ename,substr(ename,0,2),'**')
from emp;
--3.0q
select
    ename,
    length(ename)/2
from emp;
ㅊ

--3.2q
select
    ename,
    replace(ename, substr(ename, length(ename)/2+1),'**')
from emp;



select
    ename,
    substr(ename, 0, 2)
from emp;


select
    ename,
    replace(ename, 'A','**')
from emp;

select
    ename,
    replace(ename, substr(ename,0,2), '**')
from emp;

select
    ename,
    replace(ename, substr(ename, 0, length(ename)/2), '**')
from emp;

select
    ename,
    replace(ename, substr(ename, length(ename)/2 + 1 ) , '**') as AAAA
from emp;


select 'oracle',
    lpad('oracle', 15, '#')as a,
    rpad('oracle', 15, '*')as b,
    lpad('oracle', 15)as c,
    rpad('oracle', 15)as d,
    lpad('oracle', 1)as e,
    rpad('oracle', 1)as f
from dual;

select
    rpad('990428-', 14, '#'),
    rpad('010-2123-', 13, '#')
from dual;

select
    ename,
    replace(ename,substr(ename, 0, length(ename)/2), '#')
from emp;
    

이름의 반절을 #으로표시하며 바뀐자릿수가 #으로나오기

select
    ename,
    rpad(ename, 6, '*')
from emp;

select
    ename,
    lpad(ename, length(ename)*2, '*')
from emp;


--번호의 마지막 4자리를 *로 채울것
select
    '010-2123-9998',
    length('010-2123-9998') as 자릿수,
    substr('010-2123-9998', 0, length('010-2123-9998')-4) as 자른글자,
    rpad(
        substr('010-2123-9998', 0, length('010-2123-9998')-4),
        length('010-2123-9998'),
        '*'
    )as EEE
from dual;

select
    '010-2123-9998',
    length('010-2123-9998') as 자릿수,
    substr('010-2123-9998', 0, length('010-2123-9998')-4) as 자른글자,
    rpad(
        length('010-2123-9998')-4,
        length('010-2123-9998'),
        '*'
    )as EEE
from dual;

--문제
--2q
select
    ename,
    length(ename) as 이름자릿수,
    substr(ename, 0, 2) as 앞_두개,
    rpad(
        substr(ename, 0, 2),
        length(ename),
        '*'
    ) as 굳
from emp;

--3q
select
    ename,
    length(ename) as 이름자릿수,
    substr(ename, 2, length(ename)) as "첫글자빼고",
    lpad(
        substr(ename, 2, length(ename)),
        length(ename),
        '*'
    )
from emp;
--=============================
--심화1
--제출
select
    job,
       lpad(
            job,
            ((20 - length(job)) / 2) + length(job),
            '*'
        ) as lift,
    
        rpad(
            job,
            ((20 - length(job)) / 2),
            '*'
        ) as right,
    
    rpad(
        lpad(
                job,
                ((20 - length(job)) / 2) + length(job),
                '*'
            ),
        20, '*'
    )
from emp;
--job을 사이즈20 가운데정렬 하기
--왼쪽정렬안에 오른쪽정렬을넣는다.?
--좌(job,값,문자)
--우(좌(job,값,문자),20,문자) = 답

--=============================
--답안지

select
    job,
    (20-length(job)) / 2,
    lpad(
        job,
        ( (20-length(job)) / 2 ) + length(job), -- *의 개수 + job 개수
        '*'
    ),
    rpad(
        lpad(
            job,
            ( (20-length(job)) / 2 ) + length(job), -- *의 개수 + job 개수
            '*'
        ),
        20,
        '*'
    )
from emp;
--=============================
--좌측을 만들고 우측을 반복으로 붙인다.
-- 다른방법 제보
select
lpad (
        substr(job, 0, length(job)/2), 
        10, 
        '*'
    ) as "왼쪽",
    rpad(
        substr(job, length(job)/2+1), 
        10, 
        '*'
    ) "오른쪽",
rpad(
    lpad (
        substr(job, 0, length(job)/2), 
        10, 
        '*'
    ), 
    20,
    rpad(
        substr(job, length(job)/2+1), 
        10, 
        '*'
    )
)
from emp;
--=============================

--142p

select
    concat(empno, ename),
    concat(empno, concat(' : ', ename))
from emp
where ename = 'SCOTT';

select
    empno || ' : ' || ename
from emp;

select
    '    a   b      cd      ' as a,
    trim('          a  b   cd           ') as b
from dual;

--=============================
--146p 숫자함수

select
    round(1234.5678) as round,
--    정수 반올림
    round(1234.5678, 0) as round_0,
--    정수첫째 자리까지 반올림
    round(1234.5678, 1) as round_1,
--    소수 첫째 자리까지 반올림
    round(1234.5678, 2) as round_2,
--    소수 둘째 자리까지 반올림
    round(1234.5678, -1) as round_minus1,
--    정수 첫째 자리에서 부터 반올림
    round(1234.5678, -2) as round_minus2
--    정수 둘째 자리에서 부터 반올림
from dual;
     
select
    trunc(1234.5678) as trunc,
--    정수 내림
    trunc(1234.5678, 0) as trunc_0,
--    정수첫째 자리까지 내림
    trunc(1234.5678, 1) as trunc_1,
--    소수 첫째 자리까지 내림
    trunc(1234.5678, 2) as trunc_2,
--    소수 둘째 자리까지 내림
    trunc(1234.5678, -1) as trunc_minus1,
--    정수 첫째 자리에서 부터 내림
    trunc(1234.5678, -2) as trunc_minus2
--    정수 둘째 자리에서 부터 내림
from dual;

select
    ceil(3.14),
--    입력숫자에서 가장가까운 큰정수 출력
    floor(3.14),
--    입력숫자에서 가장작은 정수출력
    ceil(-3.14),
--    입력숫자에서 가장가까운 큰정수 출력
    floor(-3.14)
--    입력숫자에서 가장작은 정수출력
from dual;

select
    mod(15, 6),
    mod(10, 2),
    mod(11, 1)
--    나머지를 구하는 숫자함수
from dual;

--========================
--150p 날짜데이터 함수

select
    sysdate as now,
--    데이터베이스 서버가놓인 OS의 현재 날짜와 시간을 출력
    sysdate-1 as yesterday,
--    설정에따라 기본 출력값이 날짜의 일부만 나올수있음
    sysdate-1 as tomorrow
from dual;

select
    hiredate,
--    (입사일자)
    add_months(hiredate, 1)
from emp;

select 
    sysdate,
    round(sysdate, 'cc') as format_cc,
    round(sysdate, 'yyyy') as format_yyy,
    round(sysdate, 'q') as format_q,
    round(sysdate, 'ddd') as format_ddd,
    round(sysdate, 'hh') as format_hh
from dual;

select 
    sysdate,
    trunc(sysdate, 'cc') as format_cc,
    trunc(sysdate, 'yyyy') as format_yyy,
    trunc(sysdate, 'q') as format_q,
    trunc(sysdate, 'ddd') as format_ddd,
    trunc(sysdate, 'hh') as format_hh
from dual;


--==========================
--157p 자료형변환하는 형변환함수

--컬럼에 +를적으면 모두 숫자로 변경하여 적용
--||를 적으면 모두 문자로 인식하여 출력
select empno, empno + '500', empno || '500AA'
    FROM EMP;

select
    to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') as 현재날짜시간,
    to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh"시" mi"분" ss"초"')
--    날짜 형식지정하여 출력
from dual;

select
    to_date('2024/11/15','yyyy-mm-dd') as todate1,
    to_date('2024/11/15','yyyy-mm-dd') as todate2
from dual;

select
    to_char(
        to_date('2024/11/15 15:57:35', 'yyyy/mm/dd hh24:mi:ss'),
        'yyyy/mm/dd hh24:mi:ss') as a        
from dual;

select
    to_date(
        '2024/11/15','yyyy-mm-dd'
        ) - to_date(
                '2024/11/11', 'yyyy-mm-dd'
                )
from dual;

select
    to_date(
        '1999-04-28', 'yyyy-mm-dd'
        ) - to_date(
                '2024-11-15', 'yyyy-mm-dd'
                )
from dual;

--165p 실습6-43
select *
    from emp
where hiredate > to_date('1981-06-01','yyyy-mm-dd');


--졸업까지 d-day 계산
select
    to_date(
        '2024-11-15', 'yyyy-mm-dd'
        ) - to_date(
                '2025-05-02', 'yyyy-mm-dd'
                )
from dual;

--=======================
--167p null처리함수
select
    comm, sal,
    comm+sal,
    nvl(comm, -1),
    nvl(comm, 0) + sal
from emp;

select
    empno, ename, comm,
    nvl2(comm, 'O', 'X'),
    nvl2(comm, sal*12+comm, sal*12) as annsal
from emp;

select empno, ename, job, sal,
        decode(job,
                'MANAGER' , SAL * 1.1,
                'SALESMAN' , SAL * 1.05,
                'ANALYST' , SAL,
                SAL * 1.03) AS UPSAL
from emp;

select empno, ename, job, sal,
    case job
        when 'MANAGER' 
            then SAL * 1.1
        when 'SALESMAN'
            then SAL * 1.05
        when 'ANALYST'
            then SAL
        else sal*1.03
    end as upsal
from emp;

select ename, sal, comm,
    sal + decode(comm,
                null, 0,
                comm)
from emp;

select comm,
    case
        when comm is null then '없음'
        when comm = 0 then '수당없음'
        when comm > 0 then '수당 : ' || comm
    end as comm_text
from emp;

select comm,
    case
        when comm is null then 'N/A'
        when comm is not null then '__' || comm
    end
from emp;

--q1
--emp테이블의 empno 열에 사원이름이 다섯글자이상 여섯글자미만 사원정보출력,
--masking_empno열에는 사원번호 앞두자리 외 뒷자리를 *로 출력,
--그리고 masking_ename 열에서는 사원 이름의 첫글자만 보여주고 나머지 글자수만큼 *로 출력
select empno,
    case 
        when empno > 2
            then rpad(substr(empno,0,2),length(empno), '*')
        end as masking_empno,
    ename,
    rpad(substr(ename,0,1),length(ename), '*') as masking_ename
from emp
    where length(ename) >= 5 and length(ename) < 6;

--q2
--평균근무일수 21.5일, 하루근무일수 8시간으로봤을때
--사원들의 하루급여,와 시급을 계산하여 결과출력
--소수점 세번째 자리 에서 버리고 두번째소수점에서 반올림
select empno, ename, sal,
    trunc ((sal * 12) / (21.5 * 12) , 2) as day_pay,
    round ((sal * 12) / (21.5 * 12) / 8 , 1) as time_pay
from emp;


--q3
--add_month
--입사일(hiredate)을 기준으로 3월이지난후 첫월요일에 정직원이됨
--정직원이 되는날짜를 yyyy-mm-dd 형식으로 출력,
--단 추가수당이없는 사원은 수당은 n/a로 출력
select empno, ename, hiredate,
    ADD_MONTHS(TO_DATE('2019-12-16','YYYY-MM-DD'), 1) NEXT_MONTH,
    to_char (ADD_MONTHS(hiredate, 3), 'yyyy-mm-dd') as 날짜
from emp;


--q4
--모든사원대상으로 chg_mgr 열에 출력하기.
--직속상관 사원번호가 존재하지않으면 0000
--앞두자리가 75이면 5555, 76이면 6666, 77이면 7777, 78이면 8888

select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when mgr like '75%' then '5555'
        when mgr like '76%' then '6666'
        when mgr like '77%' then '7777'
        when mgr like '78%' then '8888'
        else '' || mgr
    end as chg_mgr,
    
    case
        when mgr is null then '0000'
        when
            substr(mgr, 2, 1) in('5','6','7','8')
        then
            trim(lpad(substr(mgr, 2, 1), length(mgr), substr(mgr, 2, 1)))
        else '' || mgr
    end as chg_mgr2
from emp;

--177p
select sum(comm) from emp;
select sum(sal + nvl(comm,0))from emp;
--count도 sum처럼 null은제외
--count 에는 * 을 많이씀
select count(*)from emp;
--다중행 함수는 다중행 함수끼리만 출력해야됨
select count(*), sum(sal) from emp;

select count(*) from emp
where deptno = 30
and comm is not null;

select max(sal), max(ename), min(hiredate), min(comm) from emp;

select count(*)from emp
where ename like '%A%';

select * from emp
where ename like '%A%';

select max(sal) from emp;

--where 절에서 다중행 함수(집계함수)를 사용할수없음
--select * from emp
--where max(sal);

select round(avg(sal), 2) from emp;

select '10', sum(sal), avg(sal) from emp where deptno = 10
union all
select '20', sum(sal), avg(sal) from emp where deptno = 20
union all
select '30', sum(sal), avg(sal) from emp where deptno = 30;

select avg(sal), deptno
from emp
group by deptno;

select deptno, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
order by deptno;


selEct deptno, job, sal, avg(sal), sum(sal), count(*)
    from emp
    group by deptno, job, sal
    having avg(sal) >= 2000
    order by deptno, job;

selEct deptno, job, sal, avg(sal), sum(sal), count(*)
    from emp
    group by deptno, job, sal
    having deptno = 20
    order by deptno, job;

select *
from emp
order by job;

--having : group by 에서만 사용
--where 에서 표현할 수 있는건 가급적 where 에서 사용하는게 좋다.
--집계함수를 조건으로 주고 싶을때 사용한다.

--순서 from > where > group by > having > select > order by
select job, count(*)
from emp
where sal > 1000
group by job
having count(*) >= 3
order by job;


--194p
--1분 복습
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal) >= 500
order by deptno, job;

--212p q1
select
    deptno,
    floor(avg(sal)) as avg_sal,
    max(sal) as max_sal,
    min(sal) as min_sal,
    count(*) as cnt
from emp
group by deptno
order by deptno desc;

--q2
select
    job, count(*)
from emp
group by job
having count(*) >= 3;

--q3
select
    hiredate as hire_year, deptno, count(*) as cnt
from emp;



select *
from emp;
--문제++
--q1 1981년 입사한 사원중에서 급여가가장낮은 사원의정보를 모두조회

select *
from emp
where hiredate between to_date('1981-01-01', 'yyyy-dd-mm') and to_date('1981-12-31', 'yyyy-mm-dd')
group by empno, ename, job, mgr, hiredate, sal, comm, deptno;


select min(sal)
from emp
where hiredate between to_date('1981-01-01', 'yyyy-dd-mm') and to_date('1981-12-31', 'yyyy-mm-dd');

--또는
--hiredate >= to_date('1981-01-01', 'yyyy-dd-mm')
--and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd');



--q2 1981년 입사한 사원중에서 급여가 1981년 평균 급여보다 높은 사원의 수를 조회

select sal,avg(sal), count(*)
from emp
where hiredate between to_date('1981-01-01', 'yyyy-dd-mm') and to_date('1981-12-31', 'yyyy-mm-dd')
group by sal
having sal >= avg(sal);



--q3 각 '부서별'로 급여가 가장높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요.

select deptno, max(sal) - min(sal)
from emp
group by deptno;

--216p 조인
select *
from emp, dept
order by empno;

--218p
select ename, e.deptno, e.*
    from emp e, dept d
    where e.deptno = d.deptno
order by empno;

select * from salgrade;

select * from emp;

select e.ename, e.sal, s.grade
from emp e, salgrade s
where
    e.sal >= s.losal
    and e.sal <= s.hisal;

select e1.ename, e1.mgr, e2.ename, e2.empno, e3.ename, e3.empno
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno and e2.mgr = e3.empno;

--outer join
--#1
select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1, emp e2
where e1.mgr = e2.empno(+);
--#2
select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1, emp e2
where e1.mgr(+)= e2.empno;
--natural join은 실무에서 자주사용하지않음
--using 은 둘다 같은 컬럼명을 사용하는 경우만 사용가능.
select deptno, emp.ename
from emp join dept using(deptno);

--테이블 조인조건을 on 으로 분리시킨다.
select *
from emp e join dept d on (e.deptno = d.deptno)
where sal <= 3000;

select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);

--235p
--left outer joing 이것의 좌측 테이블의 데이터를 살린다.(자주사용함)
--where 에서 조건을 넣으면 is not null 을사용해야하지만
--left, right, full outer join ~ on 을사용하면 생략이가능하다.
select *
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);


--===========================================
select *
from dept;
select *
from emp;
--239p
--1 급여가 2000초과인 사원들의 부서정보를 출력해라
select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno and sal > 2000
order by deptno;


--2 각 부서별 평균급여, 최대급여, 최소급여, 사원수 출력
--select d.deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*) as cnt
--from emp e join dept d using (deptno)
--group by d.deptno, d.dname;

select d.deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*) as cnt
from emp e join dept d on (d.deptno = e.deptno)
group by d.deptno, d.dname;


--3 모든부서정보와 사원정보를 사진과같이 부서번호, 사원 이름순으로 정렬하여 출력.
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e right outer join dept d on (d.deptno = e.deptno)
order by deptno, ename;

--================================
select *
from dept;
select *
from emp;
select *
from salgrade;
--추가문제 1
--사원번호, 이름, 부서명, 급여등급 출력 : 14줄 e.sal >= s.hisal
--답
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s.losal and s.hisal;


select e.empno, e.ename, d.dname, s.grade
from emp e join dept d using (deptno)
join salgrade s using (grade);

select e.empno, e.ename, d.dname, s.grade
from emp e join dept d using (deptno)
join salgrade s on ((e.sal <= s.losal) and (e.sal >= s.hisal));

select e.empno, e.ename, d.dname, s.grade
from emp e join dept d on(dname)
join salgrade s on (grade);


--추가문제 2
--상사보다 월급이 높은사원의 이름, 급여, 상사이름, 상사급여

select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1
    left outer join emp e2 on(e1.mgr = e2.empno)
where e1.sal > e2.sal;



--============================서브쿼리
select *
from emp
where ename = 'JONES';

select ENAME, SAL
from emp
where ename = 'JONES';

select *
from emp
where SAL >(SELECT SAL FROM EMP WHERE ENAME = 'JONES');

--============================
--BLAKE보다 높은 연봉을 받는 사람들 출력
--JONES 랑 같은 JOB을 가진 사람들 출력

select *
from emp
where sal >= (select sal from emp where ename = 'BLAKE');

select *
from emp
where job = (select job from emp where ename = 'JONES');

--===============================
--form 절에서 서브쿼리
select *
from (
    select empno, deptno, ename from emp
    where deptno = 10
);

select rownum, emp.* from emp;
--===================
select *
from (
    select job, count(*) as cnt from emp
    group by job
)
where cnt >= 3;

||

select job, count(*) from emp
group by job
having count(*) >= 3;


with e10 as (
    select * from emp where deptno = 10
)
select * from e10;

--==================================
select *
from dept;
select *
from emp;
select *
from salgrade;
--=================================
--262p
--q1
--전체 사원중 allen과 같은 직책인 사원들의 사원정보, 부서정보를 다음과같이 출력해라
select
    job, e.empno, e.ename, e.sal, e.deptno, d.dname
    from emp e
        join dept d
        on e.deptno = d.deptno
    where e.job = (
                select job 
                from emp
                where ename = 'ALLEN'
                )
    order by sal desc;

select job, e.empno, e.ename, e.sal, e.deptno, d.dname
    from emp e, dept d;

--다른의견
select
    job, empno, ename, sal, deptno,(select dname from dept where e.deptno = dept.deptno) as DNAME ----중요
from emp e --- 중요
where job = (select job from emp where ename = 'ALLEN');
--join을 안쓰고 select문에 써버렸어요

--q2
--전체사원의 평균급여 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하는 sql문을 작성
select
    e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
    from emp e,
        dept d,
        salgrade s
    where e.deptno = d.deptno
        and e.sal between s.losal and s.hisal
        and e.sal > (
                    select avg(sal)
                    from emp
                    )
    order by sal desc, empno asc;

select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
    from emp e join dept d on (e.deptno = d.deptno)
    join salgrade s on (s.grade);

--선생님 답
select
    e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
    from emp e,
        dept d,
        salgrade s
    where e.deptno = d.deptno
        and e.sal >= s.losal and e.sal <= s.hisal
        and e.sal >= ( select avg(sal) from emp)
    order by sal desc, empno asc;
    
--q3
--'10번 부서에서 근무하는사원중' '30번부서에는 존재하지않는 직책을 가진 사원'들의 사원정보 부서정보를 출력해라
select
    e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
    from emp e, dept d, salgrade s
    where e.deptno = d.deptno
        and e.sal between s.losal and s.hisal
        and e.deptno = 10
        and e.job not in (select job from emp where deptno = 30);
    

select *
    from emp e, dept d, salgrade s
    where e.deptno = d.deptno
    and e.sal between s.losal and s.hisal
    and e.deptno not in (select e.deptno from emp where e.deptno = 30);




--q4직책임 salesman 인사람들의 최고급여보다 높은급여를 받는 사람들의 사원정보 급여등급++
select e.empno, e.ename, e.sal, s.grade
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal
    and e.sal > (select max(sal) from emp where job = 'SALESMAN');

select *
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal
    and e.job = 'SALESMAN';

select *
    from emp e
    join salgrade s on e.sal between s.losal and s.hisal
    where e.sal > (
            select max(sal) 
            from emp
            where job = 'SALESMAN'
            );

select max(sal)
from emp
where job = 'SALESMAN';

--선생님답---
select empno, ename, sal, grade
from emp e
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where e.sal > (
    select max(sal) from emp where job = 'SALESMAN'
);

create table emp_ddl(
    empno number(4),    --숫자 4자리까지 허용
    ename varchar2(10), --가변형글씨 10바이트 까지 허용
    job varchar2(9),    --제한보다 적은글씨일때 글씨만큼 공간줄임
    mgr number(4),      --숫자 4자리까지 허용
    hirdate date,       --날짜
    sal number(7,2),    --소숫점 둘째자리까지 기록
    comm number(7,2),   --소숫점 둘째자리까지 기록
    deptno number(2)    --숫자 2자리까지 허용
);

desc emp_ddl;
select * from emp_ddl; 



create table dept_ddl
    as select * from dept;
    
desc dept_ddl;

create table emp_ddl_30
    as select *
        from emp
        where deptno = 30;
        
select * from emp_ddl_30;

create table empdept_ddl
    as select e.empno, e.ename, e.job, e.mgr, e.hiredate,
            e.sal, e.comm, d.deptno, d.dname, d.loc
        from emp e, dept d
        where 1 <> 1;

create table emp_alter
    as select * from emp;
    
select * from emp_alter;

alter table emp_alter
add hp varchar2(20);

--테이블명 변경
alter table emp_alter
rename column hp to tel;

select * from emp_alter;

alter table emp_alter
modify empno number(5);

desc emp_alter;

--특정열삭제
alter table emp_alter
    drop column tel;
--열의 타입변경
alter table emp_alter
    modify mgr varchar2(5);

rename emp_alter to emp_rename;
--데이터및 테이블 삭제
truncate table emp_rename;
select * from emp_rename;

drop table emp_rename;



select * from emp;

create table dept_temp
    as select * from dept;

select *
from dept_temp;
--insert 데이터 삽입
insert into dept_temp (deptno, dname, loc)
            values(50, 'DATABASE', 'SEOUL');
            
--=========insert 문 오류=========            
insert into dept_temp (deptno, dname, loc)
            values(50, 'DATABASE',1,1);
insert into dept_temp (deptno, dname, loc)
            values(600, 'network','busan');

insert into dept_temp
        values(60 , 'network','busan');
select * from dept_temp;

insert into dept_temp
        values(70 , 'web','null');
select * from dept_temp;

insert into dept_temp
            (deptno, dname, loc)
        values(80 , 'mobile', '');

create table emp_temp
    as select *
        from emp
        where 1 <> 1;
    
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
    values (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);
insert into emp_temp (empno, ename, hiredate)
    values (2111, '이순신', TO_DATE('2001/01/01', 'YYYY-MM-DD'));
insert into emp_temp (empno, ename, hiredate)
    values (3111, '춘향이', SYSDATE);
    
SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP
SELECT * FROM EMP WHERE DEPTNO = 10;

CREATE TABLE DEPT_TEMP2
    AS SELECT * FROM DEPT;
    
SELECT * FROM DEPT_TEMP2;

update dept_temp2
set loc = 'seoul';

select * from dept_temp2
where deptno = 40;

update dept_temp2
set dname = 'DATABASE',
    LOC = 'SEOUL'
where deptno = 40;

SELECT * FROM DEPT_TEMP2;

SELECT * FROM EMP_TEMP
WHERE SAL <= 2500;

UPDATE EMP_TEMP
SET SAL = SAL + 50
WHERE SAL <= 2500;

create table emp_temp2
    as select *
    from emp;
--EMP 테이블을 복사한 EMP_TEMP2에서 연봉이 1000 이하인 사원연봉 1.3%인상
SELECT * FROM EMP_TEMP2
where sal <= 1000;

update emp_temp2
set sal = sal * 1.013
where sal <= 1000;

SELECT * FROM EMP_TEMP2;

drop table emp_temp2;

delete from emp_temp2
where job = 'MANAGER';

delete from emp_temp2
where deptno = 10;

select * from emp_temp2;

rollback;

create table emp_temp3
as select * from emp;


create index idx_emp_sal
    on emp(sal);
    
select * from user_ind_columns;

drop index idx_emp_sal;

select /* + index(e) */
*
from emp e
where sal = 3000
order by sal asc;

select *
from user_indexes;


--급여가 높은 순서로 사원의 이름과 급여를 조회하세요. 단, 동일 급여일 경우 이름을 오름차순으로 정렬하세요.
select *
from emp
order by sal desc, ename asc;

--부서 번호가 10번과 20번인 사원들을 부서 번호별로 오름차순 정렬하고, 급여는 내림차순으로 정렬하세요.
select *
from emp
where deptno = 10 or deptno = 20
order by deptno asc, sal desc;

--MANAGER 직책을 가진 사원들의 부서에서 근무하는 사원들의 이름과 부서 이름을 출력하세요.
select *
from emp
where deptno in (select deptno
                from emp
                where JOB = 'MANAGER');

--SALESMAN 직책을 가진 사원의 평균 급여보다 높은 급여를 받는 다른 사원들의 정보를 조회하세요.
select *
from emp
where sal > (
            select avg(sal)
            from emp
            where job = 'SALESMAN'
            );

--empno가 입사 순서대로 발행되는 번호라할때 다음 입사자의 empno는?
select *
from emp order by empno;
select empno, ename, empno+1 as 다음입사자empno
from emp
where empno >= ( select max(empno)
                from emp);

--'신입이' 를 입사시킨다.
insert into emp (empno, ename)
values ((select max(empno)+1 from emp),'신입이');

create sequence seq_empno --시퀀스 생성
start with 8000           --시작 숫자 지정 (기본값 :1)
increment by 10;          --증감 숫자 (minus 사용시 감소)

select seq_empno.nextval from dual; --다음시퀀스값 가져오기
select seq_empno.nextval from dual;

select seq_empno.currval from dual; --현재시퀀스값 보기


insert into emp_temp2 (empno,ename)
values ( seq_empno.nextval, '신입3');

select * from emp_temp2;

drop sequence seq_empno;

create table table_notnull(
    login_id varchar2(20) not null,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );

insert into table_notnull (login_id, login_pwd, tel)
values ('test_id_01', '1324', null );

select * from user_constraints;
select * from table_notnull;

alter table table_notnull
modify (tel not null);
--tel에 not null제약을 주려했는데 이미 null이 들어가있어서못한다.
--그래서 tel이 nulll인 값들을 일괄적으로 0으로 수정후 제약 조건 변경
update table_notnull
set tel = '0'
where tel is null;

alter table table_notnull
modify (tel not null);

select * from table_notnull;

desc table_notnull;

create table table_pk(
    login_id  varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel       varchar2(20)
);
select * from user_constraints;
select * from user_indexes;
--primary key, pk, 주요키, 중요키, 기본키
--not null + unique 조건
--생성과 동시에 index도 생성해줌
--careate table에서 컬름을 정의하면 primary key를지정하는 방식으로는 딱하나만 지정가능
--만약 두개이상을 pk로 지정(복합키)하는경우
--alter나 primary key 방식을 이용

insert into table_pk (login_id, login_pwd, tel)
values('test_id_01','pwd01','010-1234-1234');

select * from table_pk;

insert into table_pk (login_id, login_pwd, tel)
values(null,null,null);

insert into table_pk (login_pwd, tel)
values('pwd01','010-1234-1234');

drop table table_name;
create table table_name(
    coll varchar2(20),
    col2 varchar2(20),
    col3 varchar2(20),

    primary key(coll, col2)
);

insert into table_name
values ('id1','qw1',null);
insert into table_name
values ('id1','qw2',null);
select * from table_name;

drop table dept_pk;
select * from dept_fk;
create table dept_fk(
    deptno number(2) primary key,
    dname varchar2(14),
    loc varchar2(13)
);
select * from emp_fk;
create table emp_fk(
    empno number(4),
    ename varchar2(10),
    deptno number(2) references dept_fk(deptno)
);
insert into dept_fk
values (1, 'aaaa', 'AAAA');

insert into emp_fk
values (100, '이름', 1);

update dept_fk
set deptno = 3
where deptno = 1;

create table dept_ck(
    c1 varchar2(200),
    c1 varchar2(200),
    c1 varchar2(200)
    
    primary key(c1,c2)
);
create table emp_ck(
    a1 varchar2(200),
    a1 varchar2(200),
    a1 varchar2(200)
    
    foreign key(a1,a2) references dept ck(c1,c2)
);

primary key = 기본키, PK
    --지정방법--
1. create table 테이블명(
    컬럼명 타입 primary key
    )

2. create table 테이블명(
    컬럼명 타입
    
    primary key(컬럼명)
    )

3. alter table 테이블명
    add primary key(컬럼명1,컬럼명2)


foreign key = 외래키, FK(참조)
        --지정방법--
1. create table emp(
    컬럼명 타입 references 다른테이블명 (컬럼명)
    );

2. create table emp(
    컬럼명 타입
    
    foreign key (컬럼명) references 다른테이블명 (컬럼명)
    )

3. alter table emp(
    add foreign key  (컬럼명) references 다른테이블명 (컬럼명)
    );

delete from emp
where ename = (select ename
            from emp
            where ename = '신입이');
select ename
            from emp
            where ename = '신입이';

--2024/11/25
--empno, ename 만출력
--사원번호 내림차순정렬
--앞2자리 그대로출력하고 나머지 *
--문항 1
select
    rpad(substr(empno,0,2),length(empno),'*') as empno,
    ename
from emp
order by empno desc;


--emp테이블에는 ename, empno, deptno 가있다.
--dept 테이블에는 deptno, dname,loc가있다
--empno, ename, dname, loc 출력
--부서이름 기준으로 내림차순정렬
--2문항
select e.empno, e.ename, d.dname, d.loc
from emp e join dept d using(deptno)
order by d.dname desc;

select * from emp;





create table todo (
    todo_id number primary key,
    todo varchar2(4000) not null,
    create_date date not null,
    modify_date date,
    done char(1) not null
);

create sequence seq_todo;

select * from todo;


insert into todo
values ( seq_todo.nextval, 'test', sysdate, null, 'N');

select * from todo;


update todo set done = 'Y' where todo_id = 4;

commit;

delete from todo
where todo_id=5;


--트리거 삭제
DROP TRIGGER SCOTT3_3.TRG_INVENTORYID;


CREATE SEQUENCE DISPOSALID_SEQ --시퀀스이름
START WITH 1 -- 시작값
INCREMENT BY 1 -- 증가값 (1씩 증가)
NOCACHE; -- 캐시 사용 안 함 (안전한 증가 보장)


CREATE OR REPLACE TRIGGER TRG_DISPOSALID--트리거이름
BEFORE INSERT ON FAILUREDISPOSALS -- 테이블이름
FOR EACH ROW
BEGIN
    -- 만약 시퀀스 값이 NULL이면 시퀀스 값 자동 입력
    IF :NEW.DISPOSALID IS NULL THEN
        :NEW.DISPOSALID := DISPOSALID_SEQ.NEXTVAL;
    END IF;
END;


-- 테스트값 삽입 방법
-- 시퀀스값을 자동으로올리기위해서 pk는 널로 지정하고 넣기.
INSERT INTO ORDERID
VALUES ('','VALUE2','3', 2);
Create table Shop(
    shopId number(30)           NOT NULL,
    shopName varchar2(200)      NOT NULL,
    shopAddress varchar2(200)   NOT NULL,
    shopNum number(12)          NOT NULL,
    shopCategory varchar2(200)  Null,
    shopTime varchar2(200)      Null,
    shopWay varchar2(200)       Null,
    shopLOcal varchar2(200)     NOT NULL,
    shopRivew varchar2(200)     Null,
    shopRivewEa varchar2(200)   null
);
Create table Menu(
    menuId varchar2(200)        NOT NULL,
    shopId varchar2(200)        NOT NULL,
    menuName varchar2(200)      NOT NULL,
    menuCategory varchar2(200)  Null,
    menuPrice varchar2(200)     NOT NULL,
    menuPhoto varchar2(200)     Null,
    menuAdd varchar2(200)       null
);
Create table basket(
    basketId number(30)         NOT NULL,
    orderId number(30)          NOT NULL,
    menuId number(30)           NOT NULL,
    menuEa number(30)           NOT NULL
);
Create table sOrder(
    orderId number(30)          NOT NULL,
    shopId number(30)           NOT NULL,
    memberId number(30)         NOT NULL,
    paymentMethod varchar2(200) NOT NULL,
    orderMethod varchar2(200)   NOT NULL,
    request varchar2(4000)      Null,
    allpay number(30)           NOT NULL
);
create table Review(
    reviewId number(30)         NOT NULL,
    memberId varchar2(200)      NOT NULL,
    orderId number(30)          NOT NULL,
    star number(1)              NOT NULL,
    reviewText varchar2(4000)   null,
    reviewPhoto varchar2(4000)  null,
    reviewDate date             NOT NULL
);
create table Member(
    memberId varchar2(12)       NOT NULL,
    memberPw varchar2(18)       NOT NULL,
    memberName varchar2(8)      NOT NULL,
    mail varchar2(40)           NOT NULL,
    memberNum number(11)        NOT NULL,
    memberAddress varchar2(200) NOT NULL
);


alter table shop add constraint pk_shop primary key(
    shopId
);

alter table menu add constraint pk_menu primary key(
    menuId
);

alter table basket add constraint pk_basket primary key(
    basketId
);

alter table sorder add constraint pk_sorder primary key(
    orderId
);

alter table review add constraint pk_review primary key(
    reviewId
);

alter table member add constraint pk_member primary key(
    memberId
);

select * from boms;

ALTER TABLE POSTS
ADD "NOTIFY"	VARCHAR2(1)		NOT NULL;

DESC POSTS;

insert into productionplans
value("",)