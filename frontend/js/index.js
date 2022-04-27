let currIndex = 0;
let url = "https://g4yv4i4tg4.execute-api.us-west-2.amazonaws.com/prod/memetable";
let headers = {
    authorization: {
      'x-api-key': 'FyWu0VPqWuanyt47uz7fD3SmmCBZLRHC6Xg08JLg'
    }
  }
let direction = 0; 
function next() {
    let urlExt = url.concat("/").concat((currIndex+1).toString())
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
    axios.get(url, headers).then((res) => {
        document.getElementById("image1").src=res.data.memeModel.url
        currIndex = res.data.memeModel.numInDb
        console.log(res)
    });
    direction = 0;
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