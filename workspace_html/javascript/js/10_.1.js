console.log("gd")

window.addEventListener("load",init)

function init(){
  // 선택한것에따라다르게 #view 에 출력
  const bnt1 = document.querySelector("#btn1")
  
  btn1.addEventListener("click", function(){
    const night = document.querySelector("#night");
    const view = document.querySelector("#view");
    if( night.value == 1 ){
      view.innerHTML = "게임을 선택했습니다.";
      console.log("게임을 선택했습니다.");
    } else if( night.value == 2){
      view.innerHTML = "공부를 선택했습니다.";
      console.log("공부를 선택했습니다.");
    } else if( night.value == 3){
    view.innerHTML = "good night";
    console.log("good night");
    }
  })

  // 조건문2
  // 로그인버튼을 눌렀을때 아이디 또는 비밀번호에 쓴글이없으면
  // 비번아래에 로그인버튼위에
  // 빨간색으로 아이디는 필수입니다. , 비번은 필수입니다.
  const login = document.querySelector("#login");
  login.addEventListener('click', function(){
    
    const view = document.querySelector("#view");
    const id = document.querySelector("#id");
    const pw = document.querySelector("#pw");
    console.log(id, id.value);
    console.log(pw, pw.value);

    if( id.value == ''){
      console.log('id안씀')
      view.style.color ='red'
      view.textContent ='아이디필수'
    }
  })



  function timef(){
    const view1 = document.querySelector('#view1');
    const time = new Date
    console.log(time)
    view1.textContent = time
    // textcontent는 순수하게 텍스트만을 다루는 메소드인데
    // 변수를 넣으면 왜 나옴?
  }
  
  setInterval(timef, 330)



}


