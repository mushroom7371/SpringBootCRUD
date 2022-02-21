var crud = {};

crud.init = function (){
    $('#index #btnGoHome').on('click', function (){
        $('#index').load('./');
    })

    $('#index #btnInsertGo').on('click', function (){
        $('#index').load('./insertGo');
    })

    $('#index #btnSearchGo').on('click', function (){
        $('#index').load('./searchGo');
    })
}