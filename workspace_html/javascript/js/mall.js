window.onload = ()=>{
  
  const btn = document.querySelectorAll('.btn')

  // 버튼마다 클릭이벤트
  // 장바구니 넣기
  for(let i = 0 ; i < btn.length ; i++){
    btn[i].addEventListener('click', (event)=>{
      const view = document.querySelector('#view');
      
      // console.log(event.target.value)
      // console.log(event.target.parentNode)
      
      for(let j = 0 ; j <= btn.length ; j++){
        if(event.target.value == j){
          const tagt = event.target.parentNode
          // console.log(tagt.innerHTML)
          const span=event.target.parentNode.querySelector('span').innerHTML
          // console.log(span)
          const img=event.target.parentNode.querySelector('div')
          // console.log(img)
          let price = event.target.parentNode;
          price1 = price.querySelector('.price')
          // console.log(price1.innerHTML)
          
          
          view.innerHTML += '<div><input type=checkbox checked=checked id="inchbox">'+img.innerHTML +`<br>${span}<br>`+price1.innerHTML+`<br><button class="btn">삭제</button><hr></div>`
        }
      }
    })
  }
  
  // 장바구니에서 삭제버튼
  document.querySelector('.cart').addEventListener('click', (e)=>{
    // console.log(e.target.parentNode)
    // console.log(e.target.innerText)
    if(e.target.innerText == '삭제'){
      e.target.parentNode.remove();
    }

    // 전체선택버튼 선체선택
    const sel1 = document.querySelector('#sel1')
    console.log(sel1.checked);
    // 카트에 모든것들이 체크가되어있다면 체크상태로
    // 그리고 카트의 한개라도 체크가풀리면 풀리게
    // 다체크되어있는상태에서 모두선택을다시누르면 풀리게
    const view = document.querySelector('#view')
    const inchbox = view.querySelectorAll('#inchbox')
    let flag = false;
    for(let i = 0; i < inchbox.length; i++){
      if(!inchbox[i].checked){
        flag = true;
        break;
      }
    }

    for(let i = 0 ; i < inchbox.length ; i++){
      inchbox[i] = flag;
    }
  })
  
  // 결제창에서 삭제버튼
  const moreView = document.querySelector('.moreView')
  moreView.addEventListener('click', (e)=>{
    // console.log(e.target)
    if(e.target.innerText=='삭제'){
      e.target.parentNode.remove();
    }
  })
  
  
  
  const pay = document.querySelector('#pay')
  pay.addEventListener('click',(e)=>{
    const moreView = document.querySelector('.moreView')
    const view = document.querySelector('#view');
    let price = e.target.parentNode;
    const payView = document.querySelector('#payView')
    if(moreView.classList.contains('hide')){
      moreView.classList.remove('hide')
      // console.log(view.innerHTML)
      payView.innerHTML = view.innerHTML
      pay.innerText = '결제닫기'
    } else {
      moreView.classList.add('hide')
      view.innerHTML = payView.innerHTML
      pay.innerText = '결제 하러가기'
    }
    
  })
  
  // console.log(e.target.innerText)
  // if(e.target.innerText == '삭제'){
  //   e.target.parentNode.remove();
  // }


  
}



// 버튼마다 클릭이벤트
// '장바구니넣기' 클릭을했을때 view 에 상품을 넣는다.
// ++한번더누르면 갯수 상승
// 결제하러가기 버튼클릭시
// 펼쳐지면서 상품과 가격 표시
// 그중 체크한것만 총액,결제 할수있게 변경

// 장바구니 삭제 버튼 만들기