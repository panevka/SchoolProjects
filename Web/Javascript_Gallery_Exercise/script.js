const krajobrazy = document.getElementsByClassName("krajobrazy");
const obraz = document.querySelector(".bottom>img");

const lewo = document.querySelector(".lewo");
const prawo = document.querySelector(".prawo");

console.log(krajobrazy, obraz);

function pobierz(miniaturka) {
  obraz.setAttribute("src", miniaturka.getAttribute("src"));
  disabler();
}

for (let i = 0; i < krajobrazy.length; i++) {
  krajobrazy[i].onclick = function () {
    pobierz(this);
  };
}

function klik(strona) {
  let liczba = parseInt(obraz.getAttribute("src").substring(18, 19));
  liczba = strona == "prawy" ? liczba + 1 : liczba - 1;

  obraz.setAttribute("src", "./obrazy/krajobraz" + liczba + ".jpg");
  disabler();
}

lewo.onclick = function () {
  klik("lewy");
};

prawo.onclick = function () {
  klik("prawy");
};

function disabler() {
  const numer = parseInt(obraz.getAttribute("src").substring(18, 19));
  if (numer == 5) {
    prawo.setAttribute("disabled", "disabled");
    lewo.removeAttribute("disabled");
  } else if (numer == 1) {
    lewo.setAttribute("disabled", "disabled");
    prawo.removeAttribute("disabled");
  } else {
    prawo.removeAttribute("disabled");
    lewo.removeAttribute("disabled");
  }
}
