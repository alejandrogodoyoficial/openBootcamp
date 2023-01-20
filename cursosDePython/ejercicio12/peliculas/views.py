from django.views import generic

from .models import Director, Pelicula

class IndexView(generic.ListView):
    template_name = 'peliculas/directores.html'
    model = Director

class DirectorView(generic.DetailView):
    template_name = 'peliculas/director.html'
    model = Director

class PeliculaView(generic.DetailView):
    template_name = 'peliculas/pelicula.html'
    model = Pelicula