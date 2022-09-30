"use stict";
document.querySelector("#botao").addEventListener("click", function() {
    let elem_valor = document.querySelector("#txtvalor");
    let elem_parc = document.querySelector("#txtparcelas");
    let elem_res = document.getElementById("txtresult");

    let msg = "";
    let valor_final = 0;
    let cor = "";

    let valor_compra = Number(elem_valor.value);
    let qtd_p = parseInt(elem_parc.value);
    if (qtd_p == 1) {
        valor_final = valor_compra;
        msg = `1x de R$ ${valor_final}`;
        cor = "#00ddff";
    } else if (qtd_p == 2) {
        valor_final = valor_compra + ((valor_compra * 0.03)/ qtd_p);
        msg = `${qtd_p}x de R$ ${valor_final}`;
        cor = "#ffff00";
    } else {
        valor_final = valor_compra + ((valor_compra * 0.07)/ qtd_p);
        msg = `${qtd_p}x de R$ ${valor_final}`;
        cor = "#ff0000"; 
    }
    elem_res.value = msg;
    elem_res.style.backgroundColor = cor;
});
