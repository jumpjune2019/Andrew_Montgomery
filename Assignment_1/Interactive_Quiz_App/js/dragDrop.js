// Test to make sure the file is connected to the index.html file
// console.log('You are connected!')

var dropTarget = document.querySelector(".Content_Container");
var draggables = document.querySelectorAll(".Term_Card");

for(let i = 0; i < draggables.length; i++) {
    draggables[i].addEventListener("dragstart", function(ev){
        ev.dataTransfer.setData("srcId", ev.target.id);
    });
}

dropTarget.addEventListener('dragover', function(ev) {
    ev.preventDefault();
});

dropTarget.addEventListener('drop', function(ev) {
    ev.preventDefault();
    let target = ev.target;
    let droppable  = target.classList.contains('Term_Slot');
    let srcId = ev.dataTransfer.getData("srcId");
    
    if (droppable) {
      ev.target.appendChild(document.getElementById(srcId));
    }
});
