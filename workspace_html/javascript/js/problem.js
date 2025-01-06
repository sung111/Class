window.addEventListener("load",init)

function init(){
  
  // 배열
  // 중복 없이 로또 번호를 뽑고
  // 오름차순으로 정렬해서
  // 출력한다
  const lotto = document.querySelector("#lotto")
  lotto.addEventListener('click',function(){
    let a = []
    while (a.length < 6){
      let value = parseInt(Math.random()*45) + 1;

      let dub = false;
      for(let i = 0 ; i < a.length ; i++){
        if(a[i] == value){
          dub = true;
          break;
        }
      }

      if(!dub){
        a.push(value);
      }

    }
    a.sort(function(x,y){
      return x-y;
    })

    let view = document.querySelector("#view")
    console.log(a)


    
  })
  
  
  
  // 스트링1
  // 아래와 같은 규칙이 있을때
  // todair@naver.com
  // to****@naver.com


  


  
  // 스트링2
  // cafe.naver.com
  // naver만 추출(split, indexOf와 글씨 자르기)


}  


