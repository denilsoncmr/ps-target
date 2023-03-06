public class Q4 {
/*4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. 
O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca 
em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, 
qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e 
o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado. 

SOLUÇÃO:

Matematicamente, quando o carro e o caminhão se cruzarem no momento T o ponto de encontro P(x,y) será o mesmo.
Portanto, tanto o carro quanto o caminhão estarão equidistantes da cidade de Ribeirão preto.

Sem considerar os pedagios e tomando Ribeirão Preto como referencial (posição 0).
Tomando o carro como A e o caminhão como B.

Utilizando Movimento Uniforme:

S(A) = 110km/h * t
S(B) = 100km - 80km/h * t

Para descobrir o momento em que os dois irão se encontrar basta igualar as equações acima.
Logo temos:

110km/h * t = 100km - 80km/h * t
190km/h * t = 100km
t = (100km)/(190(km/h))
t = 0,52631578947368421052631578947368 h

Substituindo o tempo encontrado em S(A):

S(A) = 110km/h * 0,52631578947368421052631578947368h
S(A) = 57,894 km (aproximadamente)

Substituindo em S(B):

S(B) = 100km - 80km/h * 0,52631578947368421052631578947368h
S(B) = 57,894 km (aproximadamente)

Em um cenário onde haja pedágio, o principio seria o mesmo. Portanto, voltando a afirmação inicial.
Tanto o carro quanto o caminhão estarão equidistantes em relação a cidade de Ribeirão Preto.

*/


}
