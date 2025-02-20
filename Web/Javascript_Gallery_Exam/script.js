const main_picture = document.querySelector(".main-pic");
const picture_array = Array.from(document.querySelectorAll(".mini-pics"));
const icon = document.querySelector(".ikona");
let IconOn = false;


picture_array.forEach((pic) => {
  pic.addEventListener("click", function () {
    main_picture.setAttribute("src", this.getAttribute("src"));
  });
});

icon.addEventListener("click", function () {
  icon.setAttribute(
    "src",
    IconOn ? "./pliki7/icon-off.png" : "./pliki7/icon-on.png"
  );

  IconOn = !IconOn;
});
