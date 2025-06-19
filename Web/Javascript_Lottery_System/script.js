function losujLiczby(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function generujLiczby() {
  let wylosowane = [];
  while (wylosowane.length !== 6) {
    let wylosowana = losujLiczby(1, 49);
    if (!wylosowane.includes(wylosowana)) {
      wylosowane.push(wylosowana);
    }
  }
  return wylosowane;
}

function totolotek() {
  let wybrane = document
    .getElementById("liczbyUzytkownika")
    .value.trim()
    .split(" ")
    .map((num) => parseInt(num))
    .filter((num) => !isNaN(num) && num >= 1 && num <= 49);

  if (wybrane.length !== 6) {
    document.getElementById("wyniki").innerHTML =
      "<p>Liczba wprowadzonych liczb musi być równa 6.</p>";
    return;
  }

  let wylosowane = generujLiczby();

  let trafione = new Set(wybrane.filter((num) => wylosowane.includes(num)));
  let liczbaTrafien = trafione.size;
  let trafioneStr = Array.from(trafione).join(", ");

  let wynikiHTML = `
                <p>Wybrane liczby: ${wybrane.join(", ")}</p>
                <p>Wylosowane liczby: ${wylosowane.join(", ")}</p>
                <p>Oto liczby, które trafiłeś: ${trafioneStr}. Łącznie trafiłeś ${liczbaTrafien} liczb</p>
            `;

  document.getElementById("wyniki").innerHTML = wynikiHTML;
}
