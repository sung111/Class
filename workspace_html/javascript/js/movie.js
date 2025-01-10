window.addEventListener('load', init)

function init() {
  
  // radio가 체크되어있으면 display:none 해제 나머지 none
  // 체크됐는지 확인
  const c1 = document.querySelector('#c1').checked
  console.log(c1)

  // 속성값이 이거인것을잡는법
  const radio = document.querySelectorAll("input[type='radio']")
  for (let i = 0; i < radio.length; i++) {
    console.log(radio[i])
  }

  const movieSelect = document.querySelectorAll("input[type='radio']")
  for (let i = 0; i < movieSelect.length; i++) {
    movieSelect[i].addEventListener('click', (event) => {
      if (movieSelect[i].checked) {
        const movieInfo = document.querySelectorAll('.movieInfo')

        // console.log(event.target.id =='c1')

        for (let j = 0; j < movieInfo.length; j++) {
          if (event.target.id == 'c1') {
            document.querySelector('.movieBox1').classList.remove('hide')
            document.querySelector('.movieBox2').classList.add('hide')
            document.querySelector('.movieBox3').classList.add('hide')
            document.querySelector('.movieBox4').classList.add('hide')
          }
          if (event.target.id == 'c2') {
            document.querySelector('.movieBox2').classList.remove('hide')
            document.querySelector('.movieBox1').classList.add('hide')
            document.querySelector('.movieBox3').classList.add('hide')
            document.querySelector('.movieBox4').classList.add('hide')
          }
          if (event.target.id == 'c3') {
            document.querySelector('.movieBox3').classList.remove('hide')
            document.querySelector('.movieBox1').classList.add('hide')
            document.querySelector('.movieBox2').classList.add('hide')
            document.querySelector('.movieBox4').classList.add('hide')
          }
          if (event.target.id == 'c4') {
            document.querySelector('.movieBox4').classList.remove('hide')
            document.querySelector('.movieBox1').classList.add('hide')
            document.querySelector('.movieBox2').classList.add('hide')
            document.querySelector('.movieBox3').classList.add('hide')
          }

        }
      }
    })
  }







  // 댓글 view에는 입력한 댓글과 수정 삭제가 가능하게하기
  // 일단 하얼빈 댓글을 구현하고 박스마다 댓글을 사용할수있게복붙
  document.querySelector('#btn1')
  .addEventListener('click', (event) => {
    const text = document.querySelector('#text1').value
      const view = document.querySelector('#view')
      view.innerHTML = `
        <div class="viewComent">
          <div class="plus">icon</div>
          <div class="plus">
            <span class="zz">${text}</span>
          </div>
          <div class="plus"><button class="tn">수정</button><button class="del">삭제</button></div>
        </div>
        ` + '<hr>' + view.innerHTML;
    })
    
  document.querySelector('#btn2')
  .addEventListener('click', (event) => {
    const text = document.querySelector('#text2').value
      const view = document.querySelector('#view2')
      view.innerHTML = `
        <div class="viewComent">
          <div class="plus">icon</div>
          <div class="plus">
            <span class="zz">${text}</span>
          </div>
          <div class="plus"><button class="tn">수정</button><button class="del">삭제</button></div>
        </div>
        ` + '<hr>' + view.innerHTML;
    })
  document.querySelector('#btn3')
  .addEventListener('click', (event) => {
    const text = document.querySelector('#text3').value
      const view = document.querySelector('#view3')
      view.innerHTML = `
        <div class="viewComent">
          <div class="plus">icon</div>
          <div class="plus">
            <span class="zz">${text}</span>
          </div>
          <div class="plus"><button class="tn">수정</button><button class="del">삭제</button></div>
        </div>
        ` + '<hr>' + view.innerHTML;
    })
  document.querySelector('#btn4')
  .addEventListener('click', (event) => {
    const text = document.querySelector('#text4').value
      const view = document.querySelector('#view4')
      view.innerHTML = `
        <div class="viewComent">
          <div class="plus">icon</div>
          <div class="plus">
            <span class="zz">${text}</span>
          </div>
          <div class="plus"><button class="tn">수정</button><button class="del">삭제</button></div>
        </div>
        ` + '<hr>' + view.innerHTML;
    })

  // 삭제 구현
  document.querySelector('#view').addEventListener('click', (event)=>{
    if(event.target.classList.contains('del')){
      // 클릭된 요소가 .del 버튼이면 해당 버튼의 부모 요소를 삭제
      const hi=event.target.parentNode;
      hi.parentNode.remove();
    }

    // input text에 값넣기
    if(event.target.classList.contains('tn')){
      const tt = event.target.parentNode.parentNode;
      const zz = tt.querySelector('.zz')
      console.log(zz.textContent);
      // zz.innerHTML = '<input type="text" id="tnwjd" class="tnwjdC">'
      // event.target.innerHTML = '<button class="dhks">수정완료</button>'
      event.target.innerHTML = `<input type="text" id="tnwjd" class="tnwjdC" value="${zz.textContent}"><button class="dhks">수정완료</button>`
      // event.target.innerHTML = `<input type="text" id="tnwjd" class="tnwjdC"><span class="zz">${text}</span> <button class="dhks">수정완료</button>`
    }

    // input text값으로 수정하기
    if(event.target.classList.contains('dhks')){
      // 수정 input text 값 선택
      const tnwjd = document.querySelector('#tnwjd').value;
      console.log(tnwjd)
      // view.
      //
      const tt = event.target.parentNode.parentNode.parentNode;
      // console.log(tt)
      const zz = tt.querySelector('.zz')
      // console.log(zz);
      zz.innerHTML = tnwjd

      event.target.parentNode.innerHTML = '수정'
    }
  })

  //수정 구현 그러면 취소도있어야됨.














}