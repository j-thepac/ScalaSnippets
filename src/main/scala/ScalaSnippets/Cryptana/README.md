minikube start
alias kubectl="minikube kubectl --"
kubectl config set-context --current --namespace=test
eval $(minikube docker-env)


docker build -t cryptana:v1 .
docker images
kubectl run -it --image=cryptana:v1 cryptana

