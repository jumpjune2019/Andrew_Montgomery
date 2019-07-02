// window.addEventListener("load", init, false);

const xhr = new XMLHttpRequest();

xhr.onload = function() {
    if(this.status === 200) {
        try{
            const resObj = JSON.parse(this.responseText);
            console.log(resObj);
        } catch(e) {
            console.warn('There was an error in the JSON. Could not parse!')
        }
    } else {
        console.warn('Did not receive 200 OK from response!');
    }
};

xhr.open('get','data/data.json');
xhr.send();