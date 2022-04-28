let memelikedlist = ['https://knowyourmeme.com/photos/2186254', 'https://www.youtube.com/watch?v=lxMIqyN0HJ4', 'https://knowyourmeme.com/photos/2276133', 'https://www.reddit.com/r/memes/comments/t43hif/itz_non_of_dein_busines/', 'https://m.facebook.com/Rmemes0/photos/the-price-of…in-by-mateus-figueredorashnutin/2526490427403233/', 'https://www.pinterest.com/pin/611082243172242709/', 'https://starwars.fandom.com/f/p/4400000000003176703', 'https://www.reddit.com/r/terriblefacebookmemes/com…from_rmemes_which_is_basically_facebook_memes_at/', 'https://www.youtube.com/watch?v=sSpDnIJxyXM', 'https://www.facebook.com/Rmemes0/', 'https://www.pinterest.com/pin/12173861481542868/', 'https://knowyourmeme.com/photos/2207649', 'https://www.youtube.com/watch?v=3NxTbAxWxqA', 'https://twitter.com/memesofredditt/status/1425349920559611906', 'https://jojo.fandom.com/f/p/4400000000000001221/r/4400000000000019281', 'https://www.reddit.com/r/memes/comments/qyx1hw/ooh_thats_right/', 'https://omghotmemes.tumblr.com/post/180523596787/doing-the-left-thing-via-rmemes', 'https://art.branipick.com/found-on-rmemes/', 'https://knowyourmeme.com/photos/2222630', 'https://www.pinterest.com/pin/677791812664693515/', 'https://www.youtube.com/watch?v=BQz_JS1gjM0', 'https://www.clashofclanshacksadvice.com/2020/08/05/misc-found-on-r-memes/', 'https://cataclysmeme.wordpress.com/2019/06/16/saw-…thought-it-belonged-here-via-r-wholesomememes-15/', 'https://www.reddit.com/r/memes/comments/rgsg5v/youre_welcome_btw/', 'https://www.facebook.com/Rmemes0/', 'https://aminoapps.com/c/meme/page/blog/r-memes-and-r-me-irl/dXzx_pwibu1PaPX6GYob1wQ8WdQvwg7oNM', 'https://knowyourmeme.com/photos/2188867', 'https://www.youtube.com/watch?v=K1jWPl7pNKo', 'https://imgflip.com/i/62s8qf', 'https://www.reddit.com/r/memes/comments/sjcze7/like_seriously_what_is_that/', 'https://www.facebook.com/Rmemes0/', 'https://browsedankmemes.com/post/185477329386/from-rmemes-via-rwholesomememes', 'https://mobile.twitter.com/rstatsmemes', 'https://memebase.cheezburger.com/tag/r-dankmemes'];
let currentPage = 1;
let amountOfPages = memelikedlist / 8;
// function load() {
//     let urlExt = url.concat("/memelikedlist/").concat(userEmail);
//         axios.get(urlExt, headers).then((res) => {
//             memelikedlist = res.data.memeLikedList
//     });
// }
function loadMemes() {
    for (let index = 1; index < 9; index++) {
        document.getElementById(index.toString()).src=memelikedlist[index]
    }
}