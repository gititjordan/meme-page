function next() {
    document.getElementById("image1").src="https://i.kym-cdn.com/photos/images/original/002/278/129/e0b.jpg";
}
function previous() {
    document.getElementById("image1").src="https://78.media.tumblr.com/6cb2fb151ce5a86d993b833a4a23eede/tumblr_pfxm7gYvqZ1soeggh_540.png";
}

async function get() {
    let url = "https://g4yv4i4tg4.execute-api.us-west-2.amazonaws.com/prod/memetable";
    axios.get(url).then((res) => {
    console.log(res);
    });
}