function validaFormulario(evento){
    if(!validCampos()){
    evento.preventDefault();
    }
    }
    
    function validCampos(){
    var campoNome = document.getElementById("nome");
    
    if(campoNome.value == ""){
    alert("O campo nome é obrigatório");
    return false;
    }
    if(campoNome.value.length < 3 || campoNome.value.length > 50){
    alert("O campo nome deve ter entre 3 e 50 caracteres");
    }
    
    var campoAnoLancamento = document.getElementById("anoLancamento");
    if(campoAnoLancamento.value == ""){
    alert("O campo ano de lançamento é obrigatório");
    return false;
    }
    if(campoAnoLancamento.value.length != 4){
    alert("O campo ano de lançamento deve ter 4 digitos");
    return false;
    }
    if(isNaN(campoAnoLancamento.value)){
    alert("O campo ano de lançamento deve ser um número");
    return false;
    }
    if(parseInt(campoAnoLancamento.value) > 2024){
    alert("O campo ano de lançamento deve ser menor que 2024");
    return false;
    }
    
    //Validar campo de sipnopse textArea
    var campoSinopse = document.getElementById("sinopse");
    if(campoSinopse.value == ""){
    alert("O campo sinopse é obrigatório");
    return false;
    }
    
    //campo generero select
    var campoGenero = document.getElementById("genero");
    if(campoGenero.value == ""){
    alert("O campo genero é obrigatório");
    return false;
    }
    
    //validacao duracao obrigatorio
    var campoDuracao = document.getElementById("duracao");
    if(campoDuracao.value == ""){
    alert("O campo duração é obrigatório");
    return false;
    }
    
    //idioma radio
    var idiomaPt = document.getElementById("legendado");
    var idiomaEn = document.getElementById("dublado");
    if(!idiomaPt.checked && !idiomaEn.checked){
    alert("Selecione um idioma");
    return false;
    }
    
    return true;
    }