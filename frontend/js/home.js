let currIndex = 0;
let direction = 0; 
function next() {
    let urlExt = url.concat("/memetable/").concat((currIndex+1).toString())
    let success = false;
    if (currIndex >= 98) {
        currIndex = 0
    }
    axios.get(urlExt, headers).then((res) => {
                document.getElementById("image1").src=res.data.memeModel.url
                success = true
                console.log(res)
            });
    
    currIndex++
    direction = 1;
}
function previous() {
    let urlExt = url.concat("/").concat((currIndex-1).toString())
    if (currIndex <= 0) {
        currIndex = 97
    }
    axios.get(urlExt, headers).then((res) => {
        document.getElementById("image1").src=res.data.memeModel.url
        currIndex-=1;
    });
    direction = -1;
}

function random() {
    let urlExt = url.concat("/memetable/")
    axios.get(urlExt, headers).then((res) => {
        document.getElementById("image1").src=res.data.memeModel.url
        currIndex = res.data.memeModel.numInDb
        console.log(res)
    });
    direction = 0;
}
function saved() {
    let urlExt = url.concat( "/memelikedlist/").concat(userEmail).concat("/").concat(document.getElementById("image1").src);
      axios.post(urlExt, headers)
      .then((res) => {
        console.log(res);
        window.location.reload();
      })
}
function handleError() {
   if (direction < 0) {
       previous()
   } else if (direction > 0) {
       next()
   } else {
       random()
   }
}