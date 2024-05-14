function getAllRequest()
{
  axios.get('https://ipwhois.app/json/')
    .then(function (response) {
        //console.log(response);
        //console.log(response.data);
        //console.log(response.data.ip);
        //console.log(response.data.isp);
        document.getElementById("ipPub").value=response.data.ip
        document.getElementById("isp").value=response.data.isp
    })
    .catch(function (error) {
        console.log(error);
    })
    .then(function () {
    });
}