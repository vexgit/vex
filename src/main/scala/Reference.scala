class Reference[T] {
  private var contents: T = _
  def set(contents: T) { this.contents = contents}
  def get: T = contents
}
