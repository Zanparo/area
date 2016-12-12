/* Simple VanillaJS to toggle class */


function closeAll(id)
{
    if (id != "Gmail")
    [].map.call(document.querySelectorAll('#profileGmail'), function(el)
      {
            el.classList.remove('profile--open');
            el.classList.add('profile');
      });
      if (id != "Twitter")
    [].map.call(document.querySelectorAll('#profileTwitter'), function(el)
      {
            el.classList.remove('profile--open');
            el.classList.add('profile');
      });
      if (id != "Skype")
    [].map.call(document.querySelectorAll('#profileSkype'), function(el)
      {
            el.classList.remove('profile--open');
            el.classList.add('profile');
      });
    if (id != "Steam")
    [].map.call(document.querySelectorAll('#profileSteam'), function(el)
      {
            el.classList.remove('profile--open');
            el.classList.add('profile');
      });
}

/* -- Gmail -- */
//*/
document.getElementById('toggleGmail').addEventListener('click', function ()
{
  closeAll("Gmail");
  [].map.call(document.querySelectorAll('#profileGmail'), function(el)
  {
    el.classList.toggle('profile--open');
  });
});
//*/

/* -- Twitter -- */
//*/
document.getElementById('toggleTwitter').addEventListener('click', function ()
{
  closeAll("Twitter");
  [].map.call(document.querySelectorAll('#profileTwitter'), function(el)
  {
    el.classList.toggle('profile--open');
  });
});
//*/

/* -- Skype -- */
//*/
document.getElementById('toggleSkype').addEventListener('click', function ()
{
  closeAll("Skype");
  [].map.call(document.querySelectorAll('#profileSkype'), function(el)
  {
    el.classList.toggle('profile--open');
  });
});
//*/

/* -- Steam -- */
//*/
document.getElementById('toggleSteam').addEventListener('click', function ()
{
  closeAll("Steam");
  [].map.call(document.querySelectorAll('#profileSteam'), function(el)
  {
    el.classList.toggle('profile--open');
  });
});
//*/

/* -- Post Gmail -- */
//*/
document.getElementById('postGmail').addEventListener('click', function ()
{
  [].map.call(document.querySelectorAll('#profileSteam'), function(el)
  {
    el.classList.toggle('profile--open');
  });
});
/*function postGmail()
{
    console.log("ceci est un test");
    document.getElementById("postGmail");
}*/
//*/