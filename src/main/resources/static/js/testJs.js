var crud = {};

crud.init = function (){
    $('#index #btnInsertGo').on('click', function (){
        $('#index').load('./insertGo');
    })
}